package com.bless.security.tokenAuth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bless.security.hander.LoginFailureHandler;
import com.bless.security.hander.LoginSuccessHandler;
import com.bless.security.service.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtLoginFilter extends AbstractAuthenticationProcessingFilter  {

    /**
     * 引入token redis 数据源进行token 验证
     */
    @Autowired
    private RedisTemplate tokenTemplate;
    /**
     * 登录失败业务逻辑处理
     */
    @Autowired
    private LoginFailureHandler failureHandler;

    /**
     * 登录成功业务逻辑处理 jwt token 生成
     */
    @Autowired
    private LoginSuccessHandler successHandler;

    public JwtLoginFilter(String defaultFilterProcessesUrl, AuthenticationManager authenticationManager) {
        super(new AntPathRequestMatcher(defaultFilterProcessesUrl));
        setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

        UserServiceImpl.UserInfo user = new ObjectMapper().readValue(request.getInputStream(), UserServiceImpl.UserInfo.class);

        return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword(),user.getAuthorities()));
    }



    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        //登录成功业务逻辑处理类
        setAuthenticationSuccessHandler(successHandler);
    }

    //登录失败业务逻辑处理
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        //登录失败业务逻辑处理类
        setAuthenticationFailureHandler(failureHandler);
    }
}
