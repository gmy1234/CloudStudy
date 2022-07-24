package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gmydl
 * @title: SentinelApp34000
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/24 11:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApp34000 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApp34000.class);
    }
}
