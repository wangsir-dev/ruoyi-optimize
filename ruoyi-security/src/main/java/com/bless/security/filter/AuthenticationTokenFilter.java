package com.bless.security.filter;

import cn.hutool.core.util.ObjectUtil;
import com.bless.security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private RedisTemplate tokenTemplate;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = request.getHeader("Auth");
        UserServiceImpl.UserInfo u = (UserServiceImpl.UserInfo) this.tokenTemplate.opsForValue().get(token);
        if(ObjectUtil.isEmpty(u)){

        }else {
            filterChain.doFilter(request, response);
        }
    }
}
