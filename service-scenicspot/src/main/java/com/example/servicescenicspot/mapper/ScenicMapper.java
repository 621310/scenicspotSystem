package com.example.servicescenicspot.mapper;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;
import com.example.servicescenicspot.entity.ScenicPic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScenicMapper {

    public List<Scenic> getScenicList();

    public ScenicDetail getScenicDetail(@Param("id") String id);

    public List<ScenicPic> getScenicPic(@Param("id") String id);
}
