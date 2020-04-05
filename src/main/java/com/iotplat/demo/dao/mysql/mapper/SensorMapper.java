package com.iotplat.demo.dao.mysql.mapper;

import com.iotplat.demo.dao.mysql.domain.Sensor;
import com.iotplat.demo.dao.mysql.domain.SensorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SensorMapper {
    long countByExample(SensorExample example);

    int deleteByExample(SensorExample example);

    int deleteByPrimaryKey(String sensorid);

    int insert(Sensor record);

    int insertSelective(Sensor record);

    List<Sensor> selectByExample(SensorExample example);

    Sensor selectByPrimaryKey(String sensorid);

    int updateByExampleSelective(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByExample(@Param("record") Sensor record, @Param("example") SensorExample example);

    int updateByPrimaryKeySelective(Sensor record);

    int updateByPrimaryKey(Sensor record);
}