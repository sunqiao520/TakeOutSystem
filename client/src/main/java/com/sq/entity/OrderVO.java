package com.sq.entity;

import lombok.Data;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 22:27
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
