package com.sq.feign;

import com.sq.entity.Order;
import com.sq.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author SunQiao
 * @create 2021-06-14 22:03
 */
@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
    public void save(@RequestBody Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    public OrderVO findAll(@PathVariable("index") int index,@PathVariable("limit") int limit);

    @GetMapping("/order/updateState/{id}")
    public void updateState(@PathVariable("id") long id);
}
