package com.snowy.southwind.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther snowy
 * @date 2020/1/20 - 0:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllVO {
    private Integer code;
    private String msg;
    private Integer count;
    private List data;



}
