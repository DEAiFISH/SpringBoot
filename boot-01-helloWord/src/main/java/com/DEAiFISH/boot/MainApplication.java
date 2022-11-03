package com.DEAiFISH.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类
 *
 * @SpringBootApplication：这是一个SpringBoot应用
 */
//@SpringBootApplication(scanBasePackages = "com.DEAiFISH.boot"/*设置扫描包位置，默认为main方法所在包*/)
@SpringBootApplication()
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        System.out.println(run.getBean("晁祥翔"));
    }
}
