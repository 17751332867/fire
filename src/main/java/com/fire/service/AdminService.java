package com.fire.service;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Admin;

public interface AdminService {
    Info Login(String username,String password);
    Info getAllAdmin();
    Info updateAdmin(Admin admin);
    Info deleteAdmin(Integer id);
    Info addAdmin(Admin admin);
}
