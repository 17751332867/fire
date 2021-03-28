package com.fire.daoTest;

import com.fire.dao.AdminDao;
import com.fire.pojo.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;
    @Test
    public void testGetAllAdmin(){
        System.out.println(adminDao.getAllAdmin());
    }
    @Test
    public void testAddAdmin(){
        Admin admin = new Admin();
        admin.setPassword("123456");
        admin.setUsername("wangyulong");
        admin.setPhone("110");
        adminDao.addAdmin(admin);
    }
    @Test
    public void testUpdateAdmin(){
        Admin admin = new Admin();
        admin.setPassword("123456");
        admin.setUsername("zhangsan");
        admin.setPhone("110");
        admin.setId(2);
        adminDao.updateAdmin(admin);
    }
    @Test
    public void testDeleteAdmin(){
        adminDao.deleteAdminById(2);
    }

}
