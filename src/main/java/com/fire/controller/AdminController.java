package com.fire.controller;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Admin;
import com.fire.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public Info login(String username,String password){
        return adminService.Login(username,password);
    }

    @GetMapping("/getAllAdmins")
    public Info getAllAdmins(){
        return adminService.getAllAdmin();
    }

    @RequestMapping("/update")
    public Info updateAdmin(Admin admin){
        return adminService.updateAdmin(admin);
    }

    @GetMapping("/delete")
    public Info deleteAdmin(Integer id){
        return adminService.deleteAdmin(id);
    }

    @PostMapping("/add")
    public Info addAdmin(Admin admin){
        return adminService.addAdmin(admin);
    }
}
