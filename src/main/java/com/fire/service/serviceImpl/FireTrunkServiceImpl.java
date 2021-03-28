package com.fire.service.serviceImpl;


import com.fire.dao.FireTrunkDao;
import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireTrunk;
import com.fire.pojo.entity.Location;
import com.fire.pojo.factory.InfoFactory;
import com.fire.pojo.msg.SystemMsg;
import com.fire.service.FireTrunkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class FireTrunkServiceImpl implements FireTrunkService {
    @Autowired
    private FireTrunkDao fireTrunkDao;

    @Override
    public Info getAllFireTrunk() {
        List<FireTrunk> fireTrunks = fireTrunkDao.getAllFireTrunk();
        if(fireTrunks==null){
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.GET_ALL_SUCCESS,SystemMsg.GET_ALL_SUCCESS_STR,fireTrunks);
    }

    @Override
    public Info updateFireTrunk(FireTrunk fireTrunk) {
        Integer msg = fireTrunkDao.updateFireTrunk(fireTrunk);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED,SystemMsg.UPDATE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,fireTrunk);
    }

    @Override
    public Info addFireTrunk(FireTrunk fireTrunk) {
        Integer msg =fireTrunkDao.addFireTrunk(fireTrunk);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.ADD_ONE_FAILED,SystemMsg.ADD_ONE_SUCCESS_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.ADD_ONE_SUCCESS,SystemMsg.ADD_ONE_SUCCESS_STR,fireTrunk);
    }

    @Override
    public Info updateFireTrunkLocation(Location location) {
        Integer msg = fireTrunkDao.updateFireTrunkLocation(location);
        if(msg==0) {
            return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_FAILED, SystemMsg.UPDATE_ONE_FAILED_STR, null);
        }
        return InfoFactory.createInfo(SystemMsg.UPDATE_ONE_SUCCESS,SystemMsg.UPDATE_ONE_SUCCESS_STR,location);
    }

    @Override
    public Info deleteFireTrunk(Integer id) {
        Integer msg = fireTrunkDao.deleteFireTrunkById(id);
        if(msg==0){
            return InfoFactory.createInfo(SystemMsg.DELETE_ONE_FAILED,SystemMsg.DELETE_ONE_FAILED_STR,null);
        }
        return InfoFactory.createInfo(SystemMsg.DELETE_ONE_SUCCESS,SystemMsg.DELETE_ONE_SUCCESS_STR,null);
    }

    @Override
    public Info getAllFireTrunkLocation() {
        List<Location> locations = fireTrunkDao.getAllFireTrunkLocation();
        if(locations!=null) {
            return InfoFactory.createInfo(SystemMsg.GET_ALL_SUCCESS, SystemMsg.GET_ALL_SUCCESS_STR, locations);
        }else{
            return InfoFactory.createInfo(SystemMsg.INTERNAL_SERVICE_ERR,SystemMsg.INTERNAL_SERVICE_ERR_STR,locations);
        }
    }
}
