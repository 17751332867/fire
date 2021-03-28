package com.fire.service;

import com.fire.pojo.dto.Info;
import com.fire.pojo.entity.HelpSeeker;
import com.fire.pojo.entity.Location;

public interface HelpSeekerService {
    Info updateLocation(Location location);
    Info deleteHelpSeeker(Integer id);
    Info updateHelpSeeker(HelpSeeker helpSeeker);
    Info addHelpSeeker(HelpSeeker helpSeeker);
    Info getAllHelpSeeker();
}
