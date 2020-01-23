package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.mapper.ScenicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scenicService")
public class ScenicServiceImpl extends BaseService implements ScenicService {

    @Autowired
    ScenicMapper scenicMapper;
    @Override
    public List<Scenic> getScenicList() {
        List<Scenic> list = scenicMapper.getScenicList();
        return list;
    }
}
