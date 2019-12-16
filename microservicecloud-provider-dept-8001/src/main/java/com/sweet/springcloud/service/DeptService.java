package com.sweet.springcloud.service;

import java.util.List;

import com.sweet.springcloud.pojo.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);

	public Dept findById(Integer deptno);

	public List<Dept> findAll();
}
