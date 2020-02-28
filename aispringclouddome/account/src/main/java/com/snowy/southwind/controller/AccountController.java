package com.snowy.southwind.controller;

import com.snowy.southwind.bean.Admin;
import com.snowy.southwind.bean.User;
import com.snowy.southwind.dao.AdminMapper;
import com.snowy.southwind.dao.UserMappero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.Pipe;

/**
 * @auther snowy
 * @date 2020/2/2 - 23:13
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    UserMappero userMappero;

    @Autowired
    AdminMapper adminMapper;

    //用户登录
    @GetMapping("/userlogin/{username}/{password}")
    public User userLogin(@PathVariable("username") String username, @PathVariable("password") String password){
        return userMappero.userLogin(username,password);
    }

    //管理员登录
    @GetMapping("/adminlogin/{username}/{password}")
    public Admin adminLogin(@PathVariable("username") String username, @PathVariable("password") String password){
        return adminMapper.adminLogin(username,password);
    }
}
