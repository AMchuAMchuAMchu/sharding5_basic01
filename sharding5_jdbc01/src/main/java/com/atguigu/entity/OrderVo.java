package com.atguigu.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderVo {
    private String orderNo;
    private BigDecimal amount;
}
