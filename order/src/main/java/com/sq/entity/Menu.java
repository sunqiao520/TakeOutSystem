package com.sq.entity;

import lombok.Data;

/**
 * @author SunQiao
 * @create 2021-06-13 16:56
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
