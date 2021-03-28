package com.fire.dao;

import com.fire.pojo.entity.FireMan;
import com.fire.pojo.entity.Location;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FireManDao {
    @Cacheable(cacheNames = "fireMans")
    @Select("select * from fire_man")
    @Results()
    public List<FireMan> getAllFireMan();

    @Cacheable(cacheNames = "fireMans")
    @Insert("insert into fire_man(name, num, age, gender, phone) values(#{name},#{num},#{age},#{gender},#{phone})")
    public Integer addFireMan(FireMan fireMan);

    @Cacheable(cacheNames = "fireMans")
    @Update("update fire_man set " +
            "longitude=#{longitude}," +
            "latitude=#{latitude}," +
            "speed=#{speed} " +
            "where id=#{id}")
    public Integer updateFireManLocation(Location location);

    @Cacheable(cacheNames = "fireMans")
    @Update("update fire_man set " +
            "name=#{name}," +
            "num=#{num}," +
            "age=#{age}," +
            "gender=#{gender}," +
            "phone=#{phone} " +
            "where id=#{id}")
    public Integer updateFireManInfo(FireMan fireMan);

    @Cacheable(cacheNames = "fireMans")
    @Update("update fire_man set " +
            "fire_truck_id=#{fireTrunkId} " +
            "where id=#{fireManId}")
    public Integer alterFireTrunk(@Param("fireManId")int fireManId, @Param("fireTrunkId") int fireTrunkId);

    @Cacheable(cacheNames = "fireMans")
    @Delete("delete from fire_man where id=#{id}")
    public Integer deleteFireMan(int id);
}
