package com.fire.service;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.FireMan;
import com.fire.pojo.entity.Location;

public interface FireManService {
    Info getAddFireMan();
    Info deleteFireManById(Integer id);
    Info updateFireMan(FireMan fireMan);
    Info updateFireManLocation(Location location);
    Info addFireMan(FireMan fireMan);
}
