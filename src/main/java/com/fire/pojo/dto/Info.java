package com.fire.pojo.dto;

import lombok.Data;

@Data
public class Info<T> {
    private Integer code;
    private String msg;
    private T data;
}
