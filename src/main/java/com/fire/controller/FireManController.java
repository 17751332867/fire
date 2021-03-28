package com.fire.controller;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireMan;
import com.fire.pojo.entity.Location;
import com.fire.service.FireManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/fireMan")
@RestController
public class FireManController {
    @Autowired
    private FireManService fireManService;
    @RequestMapping("/add")
    public Info addFireMan(FireMan fireMan){
        return fireManService.addFireMan(fireMan);
    }
    @RequestMapping("/update")
    public Info updateFireMan(FireMan fireMan){
        return fireManService.updateFireMan(fireMan);
    }
    @RequestMapping("/delete")
    public Info deleteFireMan(Integer id){
        return fireManService.deleteFireManById(id);
    }
    @RequestMapping("/getAllFireMan")
    public Info getAllFireMan(){
        return fireManService.getAddFireMan();
    }
    @RequestMapping("/updateLocation")
    public Info updateLocation(Location location){
        return fireManService.updateFireManLocation(location);
    }
}
