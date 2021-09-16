package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/9/13 21:22
 */
@Configuration
public class ConfigBean {

    @LoadBalanced //SpringCloud Ribbon是基于Neflix Ribbon实现的一套客户端 负载均衡工具
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RandomRule(); //达到的目的，用我们重新选择的随机算法替代默认的轮询
        return new RetryRule();
    }
}
