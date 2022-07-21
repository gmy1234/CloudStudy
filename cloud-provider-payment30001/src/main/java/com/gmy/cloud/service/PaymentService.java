package com.gmy.cloud.service;


import com.gmy.entity.Payment;

/**
 * @author gmydl
 * @title: PaymentService
 * @projectName CloudStudy
 * @description: 支付接口
 * @date 2022/7/21 11:16
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long paymentId);
}
