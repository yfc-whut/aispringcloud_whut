package com.snowy.southwind.controller;

import com.snowy.southwind.bean.*;
import com.snowy.southwind.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @auther yfc
 * @date 2021/6/29 - 14:09
 */
@Controller
@RequestMapping("/order")
public class OrderHandle {
    @Autowired
    OrderFeign orderFeign;

    /*保存订单*/
    @PostMapping("/save/{mid}")
    @ResponseBody
    public Msg orderSave(@PathVariable("mid")Integer mid, HttpSession session){
        User user = (User) session.getAttribute("user");
        Menu menu = new Menu();
        menu.setId(mid);
        Order order = new Order();
        order.setMenu(menu);
        order.setUser(user);
        orderFeign.orderSave(order);
        return Msg.success();
    }

    /*根据用户id查询订单*/
    @GetMapping("/findAllByUid")
    @ResponseBody
    public AllVO findAllByUid(@RequestParam("page")int page,@RequestParam("limit")int limit,HttpSession session){
        User user = (User) session.getAttribute("user");
        return new AllVO(0,"",orderFeign.countByUid(user.getId()),orderFeign.findAllByUid(user.getId(),page-1,limit));
    }

    /*根据订单状态查询所有*/
    @GetMapping("/findAllByState")
    @ResponseBody
    public AllVO findAllByState(@RequestParam("page")int page, @RequestParam("limit")int limit){
        return new AllVO(0,"",orderFeign.countByState(),orderFeign.findAllByState(page-1,limit));
    }

    /*修改订单状态*/
    @PutMapping("/updateState/{id}")
    @ResponseBody
    public Msg updateState(@PathVariable("id")long id,HttpSession session){
        Admin admin = (Admin) session.getAttribute("admin");
        orderFeign.updateState(id, admin.getId());
        return Msg.success();
    }
}
