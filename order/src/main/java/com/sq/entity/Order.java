package com.sq.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author SunQiao
 * @create 2021-06-14 21:39
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}
