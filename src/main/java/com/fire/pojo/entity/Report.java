package com.fire.pojo.entity;

import lombok.Data;

@Data
public class Report {
    private Integer id;
    private String name;
    private String phone;
    private String description;
    private String address;
    private Double latitude;
    private Double longitude;
    private String image;
}
