package com.sweet.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient         	// 本服务启动后会自动加入eureka服务中
@EnableDiscoveryClient        	//服务发现
@EnableCircuitBreaker			//对熔断器进行支持
public class DeptProviderHystrix8001_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderHystrix8001_App.class,args);
	}
}
