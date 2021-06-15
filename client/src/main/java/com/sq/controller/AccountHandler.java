package com.sq.controller;

import com.sq.entity.Admin;
import com.sq.entity.User;
import com.sq.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.LinkedHashMap;

/**
 * @author SunQiao
 * @create 2021-06-14 20:17
 */
@Controller
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private AccountFeign accountFeign;

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @PostMapping("/login")
    public String login(@RequestParam ("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session){
        Object object = accountFeign.login(username,password,type);
        LinkedHashMap<String,Object> hashMap = (LinkedHashMap<String, Object>)object;
        String result = null;
        String idStr = null;
        long id = 0;
        if(object == null){
            result = "login";
        } else {
            switch (type){
                case "user":
                    User user = new User();
                    idStr= hashMap.get("id")+"";
                    id = Long.parseLong(idStr);
                    String nickname = (String)hashMap.get("nickname");
                    user.setId(id);
                    user.setNickname(nickname);
                    session.setAttribute("user",user);
                    result = "index";
                    break;
                case "admin":
                    Admin admin = new Admin();
                    idStr= hashMap.get("id")+"";
                    id = Long.parseLong(idStr);
                    String username2 = (String) hashMap.get("username");
                    admin.setId(id);
                    admin.setUsername(username2);
                    session.setAttribute("admin",admin);
                    result = "main";
                    break;
            }
        }
        return result;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

}
