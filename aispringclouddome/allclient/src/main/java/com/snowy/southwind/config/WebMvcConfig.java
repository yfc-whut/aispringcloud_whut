package com.snowy.southwind.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @auther yfc
 * @date 2021/6/23  - 23:30
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //用户拦截器
    @Resource
    private LoginHandlerInterceptor LoginHandlerInterceptor;
    //解禁静态资源调取
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加要拦截的url                                拦截的路径
        registry.addInterceptor(LoginHandlerInterceptor).addPathPatterns("/**","/*.html")
                // 放行的路径
                .excludePathPatterns("/login.html","/account/**","/images/**","/js/**","/layui/**");
    }


}