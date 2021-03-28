package com.fire.dao;

import com.fire.pojo.entity.HelpSeeker;
import com.fire.pojo.entity.Location;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HelpSeekerDao {
    @Cacheable("helpSeekers")
    @Select("select * from help_seeker")
    List<HelpSeeker> getAllHelpSeeker();

    @Cacheable("helpSeekers")
    @Select("select * from help_seeker where id = #{id}")
    List<HelpSeeker> getHelpSeekerById(int id);

    @Cacheable("helpSeekers")
    @Update("update help_seeker set " +
            "longitude=#{longitude}," +
            "latitude=#{latitude}," +
            "speed=#{speed} " +
            "where id = #{id}")
    Integer updateHelpSeekerLocation(Location location);

    @Cacheable("helpSeekers")
    @Delete("delete from help_seeker where id=#{id}")
    Integer deleteHelpSeekerById(Integer id);

    @Cacheable("helpSeekers")
    @Insert("insert into help_seeker(name,age,gender,phone) values(#{name},#{age},#{gender},#{phone})")
    Integer addHelpSeeker(HelpSeeker helpSeeker);

    @Cacheable("helpSeekers")
    @Update("update help_seeker set " +
            "name=#{name}," +
            "age=#{age}," +
            "gender=#{gender}," +
            "phone=#{phone} " +
            "where id =#{id}")
    Integer updateHelpSeeker(HelpSeeker helpSeeker);
}
