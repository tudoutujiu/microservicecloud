package com.sweet.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweet.springcloud.dao.DeptDao;
import com.sweet.springcloud.pojo.Dept;
import com.sweet.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Integer deptno) {
		return deptDao.findById(deptno);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
