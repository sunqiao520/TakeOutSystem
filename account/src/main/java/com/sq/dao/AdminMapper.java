package com.sq.dao;

import com.sq.entity.Admin;

/**
 * @author SunQiao
 * @create 2021-06-14 19:57
 */
public interface AdminMapper {
    public Admin login(String name,String password);
}
