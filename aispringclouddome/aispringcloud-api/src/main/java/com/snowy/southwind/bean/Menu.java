package com.snowy.southwind.bean;

import lombok.Data;

/**
 * @auther yfc
 * @date 2021/6/22 - 22:18
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
