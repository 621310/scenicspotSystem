package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;

import java.util.List;

public interface ScenicService {

    public List<Scenic> getScenicList();

    public ScenicDetail getScenicDetail(String id);
}
