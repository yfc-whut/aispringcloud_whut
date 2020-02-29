package com.snowy.southwind.bean;

import lombok.Data;

import java.util.Date;

/**
 * @auther yfc
 * @date 2021/6/22 - 22:10
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private String state;
}
