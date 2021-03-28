package com.fire.service.serviceImpl;

import com.fire.dao.AdminDao;
import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.Admin;
import com.fire.pojo.factory.InfoFactory;
import com.fire.pojo.msg.SystemMsg;
import com.fire.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Info Login(String username, String password) {
        Admin admin = adminDao.getAdminByUsername(username);
        if(admin==null) {
            return InfoFactory.createInfo(SystemMsg.USER_NOT_EXIST, SystemMsg.USER_NOT_EXIST_STR, null);
        }else if(!admin.getUsername().equals(password)){
            return InfoFactory.createInfo(SystemMsg.PASSWORD_WRONG,SystemMsg.PASSWORD_WRONG_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.LOGIN_SUCCESS,SystemMsg.LOGIN_SUCCESS_STR,admin);
    }

    @Override
    public Info getAllAdmin() {
        List<Admin> admins = adminDao.getAllAdmin();
        if(admins==null){
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.GET_ALL_SUCCESS,SystemMsg.GET_ALL_SUCCESS_STR,admins);
    }

    @Override
    public Info updateAdmin(Admin admin) {
        Integer msg = adminDao.updateAdmin(admin);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,admin);
    }

    @Override
    public Info deleteAdmin(Integer id) {
        Integer msg = adminDao.deleteAdminById(id);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.DELETE_ONE_FAILED,SystemMsg.DELETE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.DELETE_ONE_SUCCESS,SystemMsg.DELETE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info addAdmin(Admin admin) {
        Integer msg = adminDao.addAdmin(admin);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_FAILED,SystemMsg.ADD_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.ADD_ONE_SUCCESS,SystemMsg.ADD_ONE_SUCCESS_STR,admin);
    }
}
