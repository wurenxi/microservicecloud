package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/9/13 20:42
 */
@EnableDiscoveryClient //服务发现
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
