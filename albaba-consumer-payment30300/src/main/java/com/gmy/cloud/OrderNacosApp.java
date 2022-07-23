package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gmydl
 * @title: OrderApp
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/23 14:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApp.class);
    }
}
