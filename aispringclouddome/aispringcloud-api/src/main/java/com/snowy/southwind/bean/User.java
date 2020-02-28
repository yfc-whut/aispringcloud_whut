package com.snowy.southwind.bean;

import lombok.Data;

import java.util.Date;

/**
 * @auther snowy
 * @date 2020/1/30 - 15:50
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;

}
