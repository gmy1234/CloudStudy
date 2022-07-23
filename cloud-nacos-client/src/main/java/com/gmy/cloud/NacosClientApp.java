package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gmydl
 * @title: NacosClientApp
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/23 15:10
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosClientApp.class);
    }
}
