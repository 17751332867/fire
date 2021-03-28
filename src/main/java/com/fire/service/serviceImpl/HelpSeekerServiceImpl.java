package com.fire.service.serviceImpl;

import com.fire.dao.HelpSeekerDao;
import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.HelpSeeker;
import com.fire.pojo.entity.Location;
import com.fire.pojo.factory.InfoFactory;
import com.fire.pojo.msg.SystemMsg;
import com.fire.service.HelpSeekerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpSeekerServiceImpl implements HelpSeekerService {
    @Autowired
    HelpSeekerDao helpSeekerDao;
    @Override
    public Info updateLocation(Location location) {
        Integer msg= helpSeekerDao.updateHelpSeekerLocation(location);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info deleteHelpSeeker(Integer id) {
        Integer msg = helpSeekerDao.deleteHelpSeekerById(id);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.DELETE_ONE_FAILED, SystemMsg.DELETE_ONE_FAILED_STR, null);
        }
        return InfoFactory.createInfo(SystemMsg.DELETE_ONE_SUCCESS,SystemMsg.DELETE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info updateHelpSeeker(HelpSeeker helpSeeker) {
        Integer msg= helpSeekerDao.updateHelpSeeker(helpSeeker);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info addHelpSeeker(HelpSeeker helpSeeker) {
        Integer msg= helpSeekerDao.addHelpSeeker(helpSeeker);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_FAILED,SystemMsg.ADD_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.ADD_ONE_SUCCESS,SystemMsg.ADD_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info getAllHelpSeeker() {
        List<HelpSeeker> helpSeekers = helpSeekerDao.getAllHelpSeeker();
        if(helpSeekers==null){
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.GET_ALL_SUCCESS,SystemMsg.GET_ALL_SUCCESS_STR,helpSeekers);
    }
}
