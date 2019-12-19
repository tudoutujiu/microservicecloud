package com.sweet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 宋德能
 * @date 2019年12月19日---下午 6:05
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloud_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloud_App.class,args);
    }
}
