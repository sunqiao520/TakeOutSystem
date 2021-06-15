package com.sq.dao;

import com.sq.entity.User;

/**
 * @author SunQiao
 * @create 2021-06-14 19:57
 */
public interface UserMapper {
    public User login(String username,String password);
}
