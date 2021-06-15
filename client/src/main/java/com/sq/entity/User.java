package com.sq.entity;


import lombok.Data;

import java.util.Date;

/**
 * @author SunQiao
 * @create 2021-06-14 16:38
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
