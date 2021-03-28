package com.fire.daoTest;

import com.fire.dao.FireManDao;
import com.fire.pojo.entity.FireMan;
import com.fire.pojo.entity.Location;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FireManDaoTest {
    @Autowired
    private FireManDao fireManDao;
    @Test
    public void testGetAllFireMan(){
        List<FireMan> allFireMan = fireManDao.getAllFireMan();
        for (FireMan fireMan:allFireMan){
            System.out.println(fireMan.getLatitude());
        }
    }

    @Test
    public void testAddFireMan(){
        FireMan fireMan = new FireMan();
        fireMan.setName("王五");
        fireMan.setAge(18);
        fireMan.setNum("0012345");
        fireMan.setPhone("19115939540");
        fireMan.setGender("男");
        fireManDao.addFireMan(fireMan);
    }

    @Test
    public void testUpdateFireManLocation(){
        Location location = new Location();
        location.setLatitude(33.24142);
        location.setLongitude(119.35841);
        location.setSpeed(1.0);
        location.setId(2);
        fireManDao.updateFireManLocation(location);
    }

    @Test
    public void testAlterFireTrunk(){
        fireManDao.alterFireTrunk(2,1);
    }

    @Test
    public void testDeleteFireMan(){
        fireManDao.deleteFireMan(3);
    }
}
