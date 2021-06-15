package com.sq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-13 19:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
