package com.fire.pojo.entity;

import lombok.Data;

import java.util.List;

@Data
public class FireTrunk extends Location{
    private int id;
    private String num;
    private String kind;
    private String name;
    private List<FireMan> fireManList;
}
