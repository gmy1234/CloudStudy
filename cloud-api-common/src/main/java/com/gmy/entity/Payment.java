package com.gmy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author gmydl
 * @title: Payment
 * @projectName CloudStudy
 * @description: 支付实体类
 * @date 2022/7/21 11:03
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;
}
