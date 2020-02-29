package com.snowy.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther yfc
 * @date 2021/6/23 - 23:09
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.snowy.southwind.dao")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
