package com.sweet.springcloud.service;

import java.util.List;

import com.sweet.springcloud.pojo.Dept;

public interface DeptService {
	
	boolean addDept(Dept dept);

	Dept findById(Integer deptno);

	List<Dept> findAll();
}
