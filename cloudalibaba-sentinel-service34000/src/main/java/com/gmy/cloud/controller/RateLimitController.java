package com.gmy.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gmy.entity.CommonResult;
import com.gmy.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gmydl
 * @title: RateLimitController
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/24 15:31
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult<?> byResource() {
        return new CommonResult<>(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }

    public CommonResult<?> handleException(BlockException exception) {
        return new CommonResult<>(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }
}
