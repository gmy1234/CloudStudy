package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gmydl
 * @title: OrderHystrixApp
 * @projectName CloudStudy
 * @description: OrderHystrixApp
 * @date 2022/7/22 13:23
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApp.class);
    }
}
