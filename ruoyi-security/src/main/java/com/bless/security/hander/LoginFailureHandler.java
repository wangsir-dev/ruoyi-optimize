package com.bless.security.hander;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component(value = "failureHandler")
public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String token = request.getHeader("token");
        // 封装的统一返回格式对象
        //Res<Object> res = Res.of(ResCode.TOKEN_CREATE_FAIL).path("/login");
        // 根据异常设置失败信息
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token",token);
        if (exception instanceof LockedException) {
            jsonObject.put("errorMsg","账户被锁定");
        } else if (exception instanceof CredentialsExpiredException) {
            jsonObject.put("errorMsg","密码过期");
        } else if (exception instanceof AccountExpiredException) {
            jsonObject.put("errorMsg","账户过期");
        } else if (exception instanceof DisabledException) {
            jsonObject.put("errorMsg","账户被禁用");
        } else if (exception instanceof BadCredentialsException) {
            jsonObject.put("errorMsg","用户名或者密码输入错误");
        }
        PrintWriter writer = response.getWriter();
        writer.print(jsonObject);
        writer.flush();
    }
}
