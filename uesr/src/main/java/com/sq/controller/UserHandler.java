package com.sq.controller;

import com.sq.dao.UserMapper;
import com.sq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 16:34
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return userMapper.findAll(index,limit);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userMapper.findById(id);
    }

    @GetMapping("/count")
    public int count(){
        return userMapper.count();
    }
    @PostMapping("/save")
    public void save(@RequestBody User user){
        userMapper.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userMapper.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userMapper.deleteById(id);
    }
}
