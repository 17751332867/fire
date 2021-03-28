package com.fire.controller;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.HelpSeeker;
import com.fire.pojo.entity.Location;
import com.fire.service.HelpSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpSeeker")
public class HelpSeekerController {
    @Autowired
    private HelpSeekerService helpSeekerService;

    @RequestMapping("/getAllHelpSeeker")
    public Info getAllHelpSeeker(){
        return helpSeekerService.getAllHelpSeeker();
    }

    @RequestMapping("/add")
    public Info addHelpSeeker(HelpSeeker helpSeeker){
        return helpSeekerService.addHelpSeeker(helpSeeker);
    }

    @RequestMapping("/update")
    public Info updateHelpSeeker(HelpSeeker helpSeeker){
        return helpSeekerService.updateHelpSeeker(helpSeeker);
    }

    @RequestMapping("/delete")
    public Info deleteHelpSeeker(Integer id){
        return helpSeekerService.deleteHelpSeeker(id);
    }

    @RequestMapping("/updateLocation")
    public Info updateHelpSeekerLocation(Location location){
        return helpSeekerService.updateLocation(location);
    }
}
