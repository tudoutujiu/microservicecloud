package com.sweet.springcloud.service;

import com.sweet.springcloud.pojo.Dept;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 宋德能
 * @date 2019年12月17日---下午 3:19
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "/dept/get/{deptno}",method = RequestMethod.GET)
    public Dept findById(@PathVariable("deptno")Integer deptno );

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

}
