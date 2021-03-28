package com.fire.dao;

import com.fire.pojo.entity.FireTrunk;
import com.fire.pojo.entity.Location;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FireTrunkDao {
    @Cacheable(cacheNames = "fireTrunk")
    @Select("select * from fire_trunk")
    List<FireTrunk> getAllFireTrunk();
    @Cacheable(cacheNames = "fireTrunk")
    @Delete("delete from fire_trunk where id=#{id}")
    Integer deleteFireTrunkById(Integer id);
    @Cacheable(cacheNames = "fireTrunk")
    @Insert("insert into fire_trunk(num,kind) values(#{num},#{kind})")
    Integer addFireTrunk(FireTrunk fireTrunk);
    @Cacheable(cacheNames = "fireTrunk")
    @Update("update fire_trunk set " +
            "num=#{num}," +
            "kind=#{kind} " +
            "where id=#{id}")
    Integer updateFireTrunk(FireTrunk fireTrunk);
    @Cacheable(cacheNames = "fireTrunk")
    @Update("update fire_trunk set " +
            "longitude=#{longitude}," +
            "latitude=#{latitude}," +
            "speed=#{speed} " +
            "where id=#{id}")
    Integer updateFireTrunkLocation(Location location);
    @Cacheable(cacheNames = "fireTrunk")
    @Select("select longitude,latitude from fire_trunk")
    List<Location> getAllFireTrunkLocation();

}
