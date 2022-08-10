package com.bless.security;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;


public class SecurityHolder {


    /**
     * 获取当前用户的信息
     * @return
     */
    public static User currentUser(){
        return (User) currentContext().getPrincipal();
    }
    /**
     * 当前用户线程的会话
     * @return
     */
    public static Authentication currentContext(){
        return  (Authentication) SecurityContextHolder.getContext().getAuthentication();
    }

}
