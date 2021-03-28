package com.fire.pojo.factory;


import com.fire.pojo.dto.Info;
import org.springframework.stereotype.Component;

@Component
public class InfoFactory {
    public static<T> Info createInfo(Integer code, String msg, T data){
        Info<T> info = new Info<>();
        info.setCode(code);
        info.setData(data);
        info.setMsg(msg);
        return info;
    }
}
