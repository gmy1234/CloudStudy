package com.gmy.cloud.controller;

import com.gmy.entity.CommonResult;
import com.gmy.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author gmydl
 * @title: OrderController
 * @projectName CloudStudy
 * @description: 消费者
 * @date 2022/7/21 13:29
 */
@RestController

public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:30001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/createPayment")
    public CommonResult<?> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }

    @GetMapping("/consumer/getPayment/{id}")
    public CommonResult<?> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

}
