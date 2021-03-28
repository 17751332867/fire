package com.fire.controller;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireTrunk;
import com.fire.pojo.entity.Location;
import com.fire.service.FireTrunkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fireTrunk")
public class FireTrunkController {
    @Autowired
    private FireTrunkService fireTrunkService;

    @RequestMapping("/getAllFireTrunk")
    public Info getAllFireTrunk(){
        return fireTrunkService.getAllFireTrunk();
    }

    @RequestMapping("/add")
    public Info addAllFireTrunk(FireTrunk fireTrunk){
        return fireTrunkService.addFireTrunk(fireTrunk);
    }

    @RequestMapping("/update")
    public Info updateFireTrunk(FireTrunk fireTrunk){
        return fireTrunkService.updateFireTrunk(fireTrunk);
    }

    @RequestMapping("/delete")
    public Info deleteFireTrunk(Integer id){
        return fireTrunkService.deleteFireTrunk(id);
    }

    @RequestMapping("/updateLocation")
    public Info updateFireTrunkLocation(Location location){
        return fireTrunkService.updateFireTrunkLocation(location);
    }

    @RequestMapping("/getAllFireTrunkLocation")
    public Info getAllFireTrunkLocation(){
        return fireTrunkService.getAllFireTrunkLocation();
    }
}
