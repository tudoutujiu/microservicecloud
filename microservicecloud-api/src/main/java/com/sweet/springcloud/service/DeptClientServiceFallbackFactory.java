package com.sweet.springcloud.service;

import com.sweet.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 宋德能
 * @date 2019年12月19日---上午 9:20
 * Fallback:备选响应
 * 千万不要忘记添加@Component,大坑！！！
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Integer deptno) {
                return new Dept().setDeptno(deptno).setDname("没有该Id"+deptno+"所对应的信息,consumer客户端提供降级信息，此刻provider已经关闭")
                        .setDb_source("No this databases in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
