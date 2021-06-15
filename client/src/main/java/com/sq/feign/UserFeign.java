package com.sq.feign;

import com.sq.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SunQiao
 * @create 2021-06-14 17:25
 */
@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,@PathVariable("limit") int limit);

    @GetMapping("/user/findById/{id}")
    public User findById(@PathVariable("id") long id);

    @GetMapping("/user/count")
    public int count();

    @PostMapping("/user/save")
    public void save(@RequestBody User user);

    @PutMapping("/user/update")
    public void update(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
