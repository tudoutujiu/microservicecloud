package com.sweet.springcloud.dao;


import com.sweet.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

	boolean addDept(Dept dept);
	
	Dept findById(Integer deptno);

	List<Dept> findAll();
}
