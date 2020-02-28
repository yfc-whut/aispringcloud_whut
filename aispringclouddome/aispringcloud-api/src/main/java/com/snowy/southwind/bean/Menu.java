package com.snowy.southwind.bean;

import lombok.Data;

/**
 * @auther snowy
 * @date 2020/1/19 - 21:59
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
