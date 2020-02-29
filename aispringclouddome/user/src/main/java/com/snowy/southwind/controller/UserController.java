package com.snowy.southwind.controller;

import com.snowy.southwind.bean.User;
import com.snowy.southwind.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @auther yfc
 * @date 2021/6/29 - 16:02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    //查询所有用户信息
    @GetMapping("/findAll/{index}/{limit}")
    public List< User > findAll(@PathVariable("index") Integer index,@PathVariable("limit") Integer limit){
            return userMapper.findAll(index,limit);
    }

    //查询信息数目
    @GetMapping("/count")
    public Integer count(){
        return userMapper.count();
    }

    //用户添加
    @PostMapping("/save")
    public void save(@RequestBody User user){
        user.setRegisterdate(new Date());
        userMapper.save(user);
    }

    // 用户删除
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")long id){
        userMapper.deleteById(id);
    }
}
