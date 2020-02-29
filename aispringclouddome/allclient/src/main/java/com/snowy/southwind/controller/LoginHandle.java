package com.snowy.southwind.controller;

import com.snowy.southwind.bean.Admin;
import com.snowy.southwind.bean.Msg;
import com.snowy.southwind.bean.User;
import com.snowy.southwind.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @auther yfc
 * @date 2021/6/29 - 20:26
 */
@Controller
@RequestMapping("/account")
public class LoginHandle {

    @Autowired
    private AccountFeign accountFeign;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session){
        String result =null;
        if (type==null){
            result ="redirect:/login.html";
        }else {
            switch (type){
                case "user":
                    User user = accountFeign.userLogin(username,password);
                    session.setAttribute("user",user);
                    result ="redirect:/index.html";
                    break;
                case "admin":
                    Admin admin = accountFeign.adminLogin(username,password);
                    session.setAttribute("admin",admin);
                    result="redirect:/main.html";
                    break;
            }
        }
        return result;
    }

    @GetMapping("/allname")
    @ResponseBody
    public Msg redirect(HttpSession session){
        User user = (User) session.getAttribute("user");
        Admin admin = (Admin) session.getAttribute("admin");
        return Msg.success().add("user",user).add("admin",admin);
    }

    @GetMapping("/logout/{type}")
    public String logout(@PathVariable("type")String type,HttpSession session){
        switch (type){
            case "user":
                session.removeAttribute("user");
                break;
            case "admin":
                session.removeAttribute("admin");
                break;
        }
        return "redirect:/login.html";
    }



}
