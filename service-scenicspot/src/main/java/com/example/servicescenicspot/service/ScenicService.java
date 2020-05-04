package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;
import com.example.servicescenicspot.entity.ScenicPic;

import java.util.List;

public interface ScenicService {

    public List<Scenic> getScenicList();

    public ScenicDetail getScenicDetail(String id);

    public List<ScenicPic> getScenicPic(String id);

    public List<Scenic> selectScenicByUserId(String userId);
}
