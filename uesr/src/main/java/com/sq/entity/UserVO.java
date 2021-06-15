package com.sq.entity;

import lombok.Data;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 19:22
 */
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
