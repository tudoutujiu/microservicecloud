package com.sweet.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//boot --> spring 配置类，类似于以前的ApplicationContext.xml
public class ConfigBean {
	
	@Bean
	@LoadBalanced	//spring cloud ribbon是基于netflit ribbon实现的一套客户端 负载均衡工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
