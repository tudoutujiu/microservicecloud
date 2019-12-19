package com.sweet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 宋德能
 * @date 2019年12月19日---下午 2:52
 */
@SpringBootApplication
@EnableHystrixDashboard     //开启dashboard仪表盘的功能，图形化监控的注解
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
