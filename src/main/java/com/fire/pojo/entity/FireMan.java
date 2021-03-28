package com.fire.pojo.entity;

import lombok.Data;

@Data
public class FireMan extends Location{
    private int id;
    private String name;
    private String num;
    private String gender;
    private int age;
    private String phone;
}
