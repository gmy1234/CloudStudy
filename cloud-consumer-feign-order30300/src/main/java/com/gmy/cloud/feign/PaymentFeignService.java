package com.gmy.cloud.feign;

import com.gmy.entity.CommonResult;
import com.gmy.entity.Payment;
import feign.Param;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gmydl
 * @title: PaymentFeignService
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/22 09:51
 */
@Component
@FeignClient
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
