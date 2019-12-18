package com.sweet.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 宋德能
 * @date 2019年12月17日---下午 12:00
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //return new RandomRule();
        return new RandomRule_SDN();
    }
}
