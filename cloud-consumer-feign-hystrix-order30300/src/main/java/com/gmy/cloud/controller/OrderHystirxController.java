package com.gmy.cloud.controller;

import com.gmy.cloud.feign.PaymentHystrixFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author gmydl
 * @title: OrderHystirxController
 * @projectName CloudStudy
 * @description: 消费者 服务
 * @date 2022/7/22 13:31
 */
@RestController
public class OrderHystirxController {

    @Resource
    private PaymentHystrixFeignService paymentHystrixFeignService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return paymentHystrixFeignService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        return paymentHystrixFeignService.paymentInfo_TimeOut(id);
    }


}
