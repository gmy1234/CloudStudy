package com.gmy.cloud;

import cn.hutool.db.sql.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gmydl
 * @title: OrderFeignApp
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/22 09:50
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApp.class);
    }
}
