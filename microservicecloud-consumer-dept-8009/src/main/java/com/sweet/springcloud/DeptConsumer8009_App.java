package com.sweet.springcloud;

import com.sweet.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)		//自定义规则
public class DeptConsumer8009_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer8009_App.class, args);
	}
}
