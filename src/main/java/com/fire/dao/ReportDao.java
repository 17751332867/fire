package com.fire.dao;

import com.fire.pojo.entity.Location;
import com.fire.pojo.entity.Report;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ReportDao {
    @Insert("insert into report(name,phone,description,address,latitude,longitude,image) " +
            "values(#{name},#{phone},#{description},#{address},#{latitude},#{longitude},#{image})")
    Integer addReport(Report report);
    @Select("select latitude,longitude from report where id=(select max(id) from report)")
    Location getLocation();
}
