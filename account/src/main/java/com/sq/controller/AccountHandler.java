package com.sq.controller;

import com.sq.dao.AdminMapper;
import com.sq.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SunQiao
 * @create 2021-06-14 20:03
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login/{username}/{password}/{type}")
    public Object login(@PathVariable("username") String username,@PathVariable("password") String password,@PathVariable("type") String type){
        Object object = null;
        switch (type){
            case "user":
                object = userMapper.login(username,password);
                break;
            case "admin":
                object = adminMapper.login(username,password);
                break;
        }
        return object;
    }
}
