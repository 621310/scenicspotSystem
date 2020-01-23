package com.example.servicescenicspot.mapper;

import com.example.servicescenicspot.entity.Scenic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScenicMapper {

    public List<Scenic> getScenicList();
}
