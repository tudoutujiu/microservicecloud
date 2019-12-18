package com.sweet.springcloud.controller;

import com.sweet.springcloud.pojo.Dept;
import com.sweet.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	//@Autowired
	private DiscoveryClient clientts;
	
	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
	
	@RequestMapping(value = "/dept/get/{deptno}",method = RequestMethod.GET)
	public Dept findById(@PathVariable("deptno")Integer deptno ) {
		return deptService.get(deptno);
	}
	
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}

	/**
	 * 把所有已经注册的服务的端口，主机等信息
	 * @return
	 */
	@RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
	public Object discovery(){
		List<String> list = clientts.getServices();
		System.out.print("**********"+list);

		List<ServiceInstance> srvList = clientts.getInstances("MICROSERVICECLOUD-DEPT");
		for(ServiceInstance element : srvList){
			System.out.print(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
		}
		return this.clientts;
	}
}
