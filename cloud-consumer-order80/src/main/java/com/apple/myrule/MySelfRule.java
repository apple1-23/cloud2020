package com.apple.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    //替换默认负载均衡算法，默认为轮询
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}
