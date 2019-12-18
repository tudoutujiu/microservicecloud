package com.sweet.springcloud.controller;

import com.sweet.springcloud.pojo.Dept;
import com.sweet.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept){
		return this.deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{deptno}")
	public Dept findById(@PathVariable("deptno")Integer deptno ){
		return this.deptClientService.findById(deptno);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(){
		return this.deptClientService.list();
	}


}
