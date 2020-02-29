package com.snowy.southwind.controller;

import com.snowy.southwind.bean.Order;
import com.snowy.southwind.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @auther yfc
 * @date 2021/6/20 - 22:03
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderMapper orderMapper;

    //用户范围
    /*保存订单*/
    @PostMapping("/save")
    public void orderSave(@RequestBody Order order){
        order.setDate(new Date());
        orderMapper.save(order);
    }

    /*根据用户id查询订单*/
    @GetMapping("/findAllByUid/{uid}/{index}/{limit}")
    public List<Order> findAllByUid(@PathVariable("uid")long uid,@PathVariable("index")int index,@PathVariable("limit")int limit){
        return orderMapper.findAllByUid(uid, index, limit);
    }

    /*根据用户查询订单数量*/
    @GetMapping("/countByUid/{uid}")
    public int countByUid(@PathVariable("uid") long uid){
       return orderMapper.countByUid(uid);
    }

    //管理员范围
    /*根据订单状态查询所有*/
    @GetMapping("/findAllByState/{index}/{limit}")
    public List<Order> findAllByState(@PathVariable("index")int index,@PathVariable("limit")int limit){
        return orderMapper.findAllByState(index, limit);
    }
    /*根据订单状态查询条数*/
    @GetMapping("/countByState")
    public int countByState(){
        return orderMapper.countByState();
    }

    /*修改订单状态*/
    @PutMapping("/updateState/{id}/{aid}")
    public void updateState(@PathVariable("id")long id,@PathVariable("aid")long aid){
        orderMapper.updateState(id,aid);
    }
}
