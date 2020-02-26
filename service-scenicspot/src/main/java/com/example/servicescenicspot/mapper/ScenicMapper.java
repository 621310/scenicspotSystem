package com.example.servicescenicspot.mapper;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScenicMapper {

    public List<Scenic> getScenicList();

    public ScenicDetail getScenicDetail(@Param("id") String id);
}
