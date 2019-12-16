package com.sweet.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sweet.springcloud.pojo.Dept;

@RestController
public class DeptController_Consumer {
	
	private static final String REST_URL_PREFIX = "http://localhost:8001";

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value = "/consumer/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno")Integer deptno) {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+deptno,Dept.class);
	}
	
	@SuppressWarnings("unchecked")			//这一句压制了警告
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
}
