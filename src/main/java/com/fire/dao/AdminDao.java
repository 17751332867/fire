package com.fire.dao;

import com.fire.pojo.entity.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminDao {
    @Cacheable(cacheNames = "admin")
    @Select("select * from admin")
    List<Admin> getAllAdmin();

    @Cacheable(cacheNames = "admin")
    @Select("select * from admin where id=#{id}")
    Admin getAdminById(int id);

    @Cacheable(cacheNames = "admin")
    @Select("select * from admin where username=#{username}")
    Admin getAdminByUsername(String username);

    @Cacheable(cacheNames = "admin")
    @Insert("insert into admin(username,password,phone) " +
            "values(#{username},#{password},#{phone})")
    Integer addAdmin(Admin admin);

    @Cacheable(cacheNames = "admin")
    @Update("update admin set " +
            "phone=#{phone}," +
            "username=#{username}," +
            "password=#{password} " +
            "where id=#{id}")
    Integer updateAdmin(Admin admin);

    @Cacheable(cacheNames = "admin")
    @Delete("delete from admin where id=#{id}")
    Integer deleteAdminById(Integer id);
}
