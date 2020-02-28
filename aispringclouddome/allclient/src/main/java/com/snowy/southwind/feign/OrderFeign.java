package com.snowy.southwind.feign;

import com.snowy.southwind.bean.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther snowy
 * @date 2020/2/8 - 14:03
 */
@FeignClient(value = "order")
public interface OrderFeign {
    /*保存订单*/
    @PostMapping("/order/save")
    void orderSave(@RequestBody Order order);

    /*根据用户id查询订单*/
    @GetMapping("/order/findAllByUid/{uid}/{index}/{limit}")
    List <Order> findAllByUid(@PathVariable("uid")long uid, @PathVariable("index")int index, @PathVariable("limit")int limit);

    /*根据用户查询订单数量*/
    @GetMapping("/order/countByUid/{uid}")
    int countByUid(@PathVariable("uid") long uid);

    /*根据订单状态查询所有*/
    @GetMapping("/order/findAllByState/{index}/{limit}")
    List<Order> findAllByState(@PathVariable("index")int index,@PathVariable("limit")int limit);

    /*根据订单状态查询条数*/
    @GetMapping("/order/countByState")
    int countByState();

    /*修改订单状态*/
    @PutMapping("/order/updateState/{id}/{aid}")
    void updateState(@PathVariable("id")long id,@PathVariable("aid")long aid);
}
