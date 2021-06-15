package com.sq.controller;

import com.sq.dao.MenuMapper;
import com.sq.dao.TypeMapper;
import com.sq.entity.Menu;
import com.sq.entity.MenuVO;
import com.sq.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-13 16:29
 */
@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private TypeMapper typeMapper;


    @GetMapping("/index")
    public String index(){
        return this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        return new MenuVO(0,"",menuMapper.count(),menuMapper.findAll(index,limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuMapper.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        return typeMapper.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuMapper.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuMapper.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuMapper.update(menu);
    }
}
