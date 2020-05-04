package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;
import com.example.servicescenicspot.entity.ScenicPic;
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

    @Override
    public ScenicDetail getScenicDetail(String id) {
        ScenicDetail scenicDetail = scenicMapper.getScenicDetail(id);
        return scenicDetail;
    }

    @Override
    public List<ScenicPic> getScenicPic(String id) {
        List<ScenicPic> scenicPics = scenicMapper.getScenicPic(id);
        return scenicPics;
    }

    @Override
    public List<Scenic> selectScenicByUserId(String userId) {
        List<Scenic> list = scenicMapper.selectScenicByUserId(userId);
        return list;
    }
}
