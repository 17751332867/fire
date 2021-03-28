package com.fire.service.serviceImpl;

import com.fire.dao.FireManDao;
import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireMan;
import com.fire.pojo.entity.Location;
import com.fire.pojo.factory.InfoFactory;
import com.fire.pojo.msg.SystemMsg;
import com.fire.service.FireManService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FireManServiceImpl implements FireManService {
    @Autowired
    private FireManDao fireManDao;

    @Override
    public Info getAddFireMan() {
        List<FireMan> fireMans = fireManDao.getAllFireMan();
        if(fireMans==null){
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.GET_ALL_SUCCESS,SystemMsg.GET_ALL_SUCCESS_STR,fireMans);
    }

    @Override
    public Info deleteFireManById(Integer id) {
        Integer msg = fireManDao.deleteFireMan(id);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.DELETE_ONE_FAILED,SystemMsg.DELETE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.DELETE_ONE_SUCCESS,SystemMsg.DELETE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info updateFireMan(FireMan fireMan) {
        Integer msg = fireManDao.updateFireManInfo(fireMan);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info updateFireManLocation(Location location) {
        Integer msg  = fireManDao.updateFireManLocation(location);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,location);
    }

    @Override
    public Info addFireMan(FireMan fireMan) {
        Integer msg = fireManDao.addFireMan(fireMan);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_FAILED,SystemMsg.ADD_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.ADD_ONE_SUCCESS,SystemMsg.ADD_ONE_SUCCESS_STR,fireMan);
    }
}
