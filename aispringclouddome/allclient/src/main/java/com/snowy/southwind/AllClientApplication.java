package com.snowy.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther snowy
 * @date 2020/1/19 - 23:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AllClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllClientApplication.class,args);
    }
}
