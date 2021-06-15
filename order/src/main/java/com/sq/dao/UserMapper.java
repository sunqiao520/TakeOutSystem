package com.sq.dao;

import com.sq.entity.User;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 16:41
 */
public interface UserMapper {
    public List<User> findAll(int index, int limit);
    public User findById(long id);
    public int count();
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
