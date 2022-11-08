package com.DEAiFISH.boot.config;

import com.DEAiFISH.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true/*是否开启代理*/)
public class MyConfig {
    @Bean("晁祥翔"/*bean 默认名字*/)
    public User user() {
        return new User("cxx", 20, "男");
    }
}
