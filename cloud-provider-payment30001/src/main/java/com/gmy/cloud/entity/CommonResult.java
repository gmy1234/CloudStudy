package com.gmy.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gmydl
 * @title: CommonResult
 * @projectName CloudStudy
 * @description: 统一返回类型
 * @date 2022/7/21 11:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
