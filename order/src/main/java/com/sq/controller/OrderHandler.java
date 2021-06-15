package com.sq.controller;

import com.sq.dao.OrderMapper;
import com.sq.entity.Order;
import com.sq.entity.OrderVO;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-13 16:10
 */
@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/save")
    private void save(@RequestBody Order order){
        order.setDate(new Date());
        orderMapper.save(order);
    }

    @GetMapping("/findAllByUid/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid){
        OrderVO orderVO = new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderMapper.countByUid(uid));
        orderVO.setData(orderMapper.findAllByUid(index,limit,uid));
        return orderVO;
    }

    @GetMapping("/countByUid/{uid}")
    public int countByUid(@PathVariable("uid") int uid){
        return orderMapper.countByUid(uid);
    }

    @GetMapping("/findAll/{index}/{limit}")
    public OrderVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        OrderVO orderVO = new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderMapper.count());
        orderVO.setData(orderMapper.findAll(index,limit));
        return orderVO;
    }

    @GetMapping("/updateState/{id}")
    public void update(@PathVariable("id") long id){
        orderMapper.updateState(id);
    }
}
