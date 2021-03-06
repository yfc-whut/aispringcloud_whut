package com.snowy.southwind.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther yfc
 * @date 2021/6/23  - 23:29
 */
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        Object admin = request.getSession().getAttribute("admin");
        if (user==null&&admin==null){
            request.setAttribute("msg" ,"没有权限");
            response.sendRedirect("/login.html");
            return false;
        }else {
            return true;
        }

    }
}
