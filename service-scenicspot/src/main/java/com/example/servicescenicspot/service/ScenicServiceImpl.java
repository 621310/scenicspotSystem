package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.mapper.ScenicMapper;
import com.example.servicescenicspot.util.util;
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
//        String id = util.userid;
        return list;
    }
}
