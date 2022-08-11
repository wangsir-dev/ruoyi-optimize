package com.bless.admin.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * 刚开始因为jedis版本过高，edisConnectionFactory.afterPropertiesSet(); 报错，调试了好久
 * 现在jedis 改为3.7.0 就好了
 */
@Configuration(proxyBeanMethods = false)
@EnableAutoConfiguration(exclude = {RedisAutoConfiguration.class})
public class RedisConfig {

    @Bean(name = "tokenTemplate")
    public RedisTemplate tokenTemplate(@Qualifier("redisD0") RedisProperties redisD0 ){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(redisD0.getHost());
        jedisConnectionFactory.setDatabase(redisD0.getDatabase());
        jedisConnectionFactory.setPort(redisD0.getPort());
        jedisConnectionFactory.setPassword(redisD0.getPassword());
        jedisConnectionFactory.afterPropertiesSet();
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        FastJsonRedisSerializer<Object> serializer = new FastJsonRedisSerializer<Object>(Object.class);
        // value值的序列化采用fastJsonRedisSerializer
        template.setValueSerializer(serializer);
        template.setHashValueSerializer(serializer);
        // key的序列化采用StringRedisSerializer
        template.setKeySerializer(new StringRedisSerializer() );
        template.setHashKeySerializer(new StringRedisSerializer());
        template.afterPropertiesSet();

        return template;
    }

    @Bean("interfaceTemplate")
    @Order(1)
    public RedisTemplate interfaceTemplate(@Qualifier("redisD1") RedisProperties redisD0  ){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(redisD0.getHost());
        jedisConnectionFactory.setDatabase(redisD0.getDatabase());
        jedisConnectionFactory.setPort(redisD0.getPort());
        jedisConnectionFactory.setPassword(redisD0.getPassword());
        jedisConnectionFactory.afterPropertiesSet();
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        FastJsonRedisSerializer<Object> serializer = new FastJsonRedisSerializer<Object>(Object.class);
        // value值的序列化采用fastJsonRedisSerializer
        template.setValueSerializer(serializer);
        template.setHashValueSerializer(serializer);
        // key的序列化采用StringRedisSerializer
        template.setKeySerializer(new StringRedisSerializer() );
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setConnectionFactory(jedisConnectionFactory);
        template.afterPropertiesSet();
        return template;
    }

}
