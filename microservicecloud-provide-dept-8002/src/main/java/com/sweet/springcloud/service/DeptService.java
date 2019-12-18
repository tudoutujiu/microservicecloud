package com.sweet.springcloud.service;

import com.sweet.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
	
	boolean add(Dept dept);

	Dept get(Integer deptno);

	List<Dept> list();
}
