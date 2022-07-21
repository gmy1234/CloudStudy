package com.gmy.cloud.service.impl;

import com.gmy.cloud.dao.PaymentDao;
import com.gmy.cloud.service.PaymentService;
import com.gmy.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gmydl
 * @title: PaymentServiceImpl
 * @projectName CloudStudy
 * @description: 支付服务类
 * @date 2022/7/21 11:16
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long paymentId){
        return paymentDao.getPaymentById(paymentId);
    }


}
