package com.sweet.springcloud.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sweet.springcloud.pojo.Dept;

@Mapper
public interface DeptDao {

	boolean addDept(Dept dept);
	
	Dept findById(Integer deptno);

	List<Dept> findAll();
}
