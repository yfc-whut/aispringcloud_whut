package com.snowy.southwind.feign;

import com.snowy.southwind.bean.Admin;
import com.snowy.southwind.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @auther snowy
 * @date 2020/2/3 - 20:26
 */
@FeignClient(value = "account")
public interface AccountFeign {
    //用户登录
    @GetMapping("/account/userlogin/{username}/{password}")
    User userLogin(@PathVariable("username") String username, @PathVariable("password") String password);

    //管理员登录
    @GetMapping("/account/adminlogin/{username}/{password}")
    Admin adminLogin(@PathVariable("username") String username, @PathVariable("password") String password);
}
