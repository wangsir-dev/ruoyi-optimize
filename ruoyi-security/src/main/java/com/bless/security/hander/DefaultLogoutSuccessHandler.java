package com.bless.security.hander;

import org.springframework.security.web.authentication.logout.ForwardLogoutSuccessHandler;

public class DefaultLogoutSuccessHandler extends ForwardLogoutSuccessHandler {
    public DefaultLogoutSuccessHandler(String targetUrl) {
        super(targetUrl);
    }
}
