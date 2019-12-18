package com.sweet.springcloud;

import com.sweet.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sweet.springcloud"})
@ComponentScan("com.sweet.springcloud")		//这里没有引入actuator监听器，启动失败
public class DeptConsumerFeign8009_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFeign8009_App.class, args);
	}
}
