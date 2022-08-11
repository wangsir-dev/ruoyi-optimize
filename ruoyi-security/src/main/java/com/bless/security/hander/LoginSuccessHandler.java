package com.bless.security.hander;

import cn.hutool.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@Component(value = "successHandler")
public class LoginSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        Map<String,Object> success = new HashMap<String,Object>(){{
            put("code",200);
            put("message","认证成功");
            put("path","login");
        }};
        Object principal = authentication.getPrincipal();
        if (principal instanceof User) {
            // 根据用户信息，使用 JWT 工具类构建 Token
            // ...
            // 存到返回内容中
            success.put("data", "token...");
        }
        // 以 JSON 格式写入 response
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(new JSONObject(success));
        writer.flush();
        writer.close();

    }
}
