package com.sq.dao;

import com.sq.entity.Type;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-13 20:36
 */
public interface TypeMapper {
    public Type findById(long id);
    public List<Type> findAll();
}
