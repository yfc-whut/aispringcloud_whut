package com.snowy.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @auther snowy
 * @date 2020/2/19 - 22:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class AllZuullApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllZuullApplication.class,args);
    }
}
