package com.gmy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gmydl
 * @title: PaymentHystrixApp
 * @projectName CloudStudy
 * @description: HystrixApp
 * @date 2022/7/22 10:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApp.class);
    }
}
