package com.snowy.southwind.controller;

import com.snowy.southwind.bean.AllVO;
import com.snowy.southwind.bean.User;
import com.snowy.southwind.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @auther snowy
 * @date 2020/1/30 - 22:30
 */
@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    UserFeign userFeign;

    /*查询所有所有用户*/
    @GetMapping("/findAll")
    @ResponseBody
    public AllVO findAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit){
        Integer index = (page-1)*limit;
        return new AllVO(0,"",userFeign.count(),userFeign.findAll(index, limit));
    }

    /*用户添加*/
    @PostMapping("/save")
    public String usersave(User user){
        userFeign.save(user);
        return "redirect:/user_manage.html";
    }
    //用户删除
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        userFeign.deleteById(id);
        return "redirect:/user_manage.html";
    }
}
