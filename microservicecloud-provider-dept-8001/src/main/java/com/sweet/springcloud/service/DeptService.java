package com.sweet.springcloud.service;

import java.util.List;

import com.sweet.springcloud.pojo.Dept;

public interface DeptService {
	
	boolean add(Dept dept);

	Dept get(Integer deptno);

	List<Dept> list();
}
