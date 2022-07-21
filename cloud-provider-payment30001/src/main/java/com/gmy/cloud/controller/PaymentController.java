package com.gmy.cloud.controller;


import com.gmy.cloud.service.PaymentService;
import com.gmy.entity.CommonResult;
import com.gmy.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gmydl
 * @title: PaymentController
 * @projectName CloudStudy
 * @description: 支付
 * @date 2022/7/21 11:19
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/insert")
    public CommonResult<?> createPayment(@RequestBody Payment payment){
        int count = paymentService.create(payment);
        log.info("插入数据" + count);

        if(count > 0) {
            return new CommonResult<>(200,"插入数据库成功", count);
        }else {
            return new CommonResult<>(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentInfoById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("获取信息");
        if (payment != null) {
            return new CommonResult<>(200, "成功", payment);
        }
            return new CommonResult<>(444,"插入数据库失败",null);
    }
}
