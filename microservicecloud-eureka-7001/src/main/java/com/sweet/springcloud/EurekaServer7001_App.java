package com.sweet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 宋德能
 * @date 2019年12月16日---下午 3:08
 */
@SpringBootApplication
@EnableEurekaServer     //EurekaServer服务端启动类，接受其他服务端注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
