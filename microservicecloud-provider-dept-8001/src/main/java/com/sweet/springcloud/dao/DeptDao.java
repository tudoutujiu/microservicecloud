package com.sweet.springcloud.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sweet.springcloud.pojo.Dept;

@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);
	
	public Dept findById(Integer deptno);
	
	public List<Dept> findAll();
}
