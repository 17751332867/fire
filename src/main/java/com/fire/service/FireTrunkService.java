package com.fire.service;


import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireTrunk;
import com.fire.pojo.entity.Location;

public interface FireTrunkService {
    Info getAllFireTrunk();
    Info updateFireTrunk(FireTrunk fireTrunk);
    Info addFireTrunk(FireTrunk fireTrunk);
    Info updateFireTrunkLocation(Location location);
    Info deleteFireTrunk(Integer id);
    Info getAllFireTrunkLocation();
}
