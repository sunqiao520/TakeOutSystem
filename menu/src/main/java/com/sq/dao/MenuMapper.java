package com.sq.dao;

import com.sq.entity.Menu;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-13 17:17
 */
public interface MenuMapper {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
