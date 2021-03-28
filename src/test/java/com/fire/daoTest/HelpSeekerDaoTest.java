package com.fire.daoTest;

import com.fire.dao.HelpSeekerDao;
import com.fire.pojo.entity.HelpSeeker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelpSeekerDaoTest {
    @Autowired
    HelpSeekerDao helpSeekerDao;
    @Test
    public void testAddHelpSeeker(){
        HelpSeeker helpSeeker = new HelpSeeker();
        helpSeeker.setAge(21);
        helpSeeker.setGender("女");
        helpSeeker.setName("lisi");
        helpSeeker.setPhone("12345678910");
        helpSeekerDao.addHelpSeeker(helpSeeker);
    }
    @Test
    public void testUpdateHelpSeeker(){
        HelpSeeker helpSeeker = new HelpSeeker();
        helpSeeker.setAge(21);
        helpSeeker.setGender("男");
        helpSeeker.setName("张三");
        helpSeeker.setPhone("12345678910");
        helpSeeker.setId(1);
        helpSeekerDao.updateHelpSeeker(helpSeeker);
    }

    @Test
    public void testDeleteHelpSeeker(){
        helpSeekerDao.deleteHelpSeekerById(2);
    }
}
