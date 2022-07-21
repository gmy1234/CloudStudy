package com.gmy.cloud.dao;

import com.gmy.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author gmydl
 * @title: PaymentDao
 * @projectName CloudStudy
 * @description: DB操作
 * @date 2022/7/21 11:07
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
