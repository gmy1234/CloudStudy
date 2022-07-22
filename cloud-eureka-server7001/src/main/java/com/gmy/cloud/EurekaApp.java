package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gmydl
 * @title: EurekaApp
 * @projectName CloudStudy
 * @description: EurekaApp
 * @date 2022/7/22 10:59
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class);
    }
}
