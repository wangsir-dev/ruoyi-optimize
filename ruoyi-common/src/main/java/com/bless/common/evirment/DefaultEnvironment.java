package com.bless.common.evirment;

import cn.hutool.core.lang.Console;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
public class DefaultEnvironment implements EnvironmentAware {
    private static String prefix = "spring.redis";
    @Override
    public void setEnvironment(Environment environment) {
        Map<String, String> multiRedisInfos =
                Binder.get(environment).bind(prefix, Bindable.mapOf(String.class, String.class)).get();
        Console.log(multiRedisInfos);
    }
}
