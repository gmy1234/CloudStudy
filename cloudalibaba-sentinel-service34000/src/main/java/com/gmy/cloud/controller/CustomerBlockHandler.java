package com.gmy.cloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gmy.entity.CommonResult;

/**
 * @author gmydl
 * @title: CustomerBlockHandler
 * @projectName CloudStudy
 * @description: TODO
 * @date 2022/7/24 15:48
 */
public class CustomerBlockHandler {
    public static CommonResult<?> handlerException(BlockException exception) {
        return new CommonResult<>(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult<?> handlerException2(BlockException exception) {
        return new CommonResult<>(4444,"按客戶自定义,global handlerException----2");
    }
}
