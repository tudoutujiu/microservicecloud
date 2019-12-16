package com.sweet.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sweet.springcloud.pojo.Dept;
import com.sweet.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}
	
	@RequestMapping(value = "/dept/get/{deptno}",method = RequestMethod.GET)
	public Dept findById(@PathVariable("deptno")Integer deptno ) {
		return deptService.findById(deptno);
	}
	
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> findById() {
		return deptService.findAll();
	}

}
