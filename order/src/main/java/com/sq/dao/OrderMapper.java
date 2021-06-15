package com.sq.dao;

import com.sq.entity.Order;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 21:42
 */
public interface OrderMapper {
    public void save(Order order);
    public List<Order> findAllByUid(int index,int limit,long uid);
    public int countByUid(long uid);
    public List<Order> findAll(int index,int limit);
    public void updateState(long id);
    public int count();
}
