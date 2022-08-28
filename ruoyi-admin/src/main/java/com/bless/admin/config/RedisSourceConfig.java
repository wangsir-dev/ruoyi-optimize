package com.bless.admin.config;


import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
public class RedisSourceConfig {

    @Bean(name = "redisD0")
    @ConfigurationProperties("spring.redis.db0")
    @Primary
    public RedisProperties redisD0(){
        return new RedisProperties();
    }



    @Bean(name = "redisD1")
    @ConfigurationProperties(prefix = "spring.redis.db1")
    public RedisProperties redisD1(){
        return new RedisProperties();
    }




}
