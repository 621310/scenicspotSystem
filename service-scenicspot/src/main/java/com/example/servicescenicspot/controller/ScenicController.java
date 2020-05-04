package com.example.servicescenicspot.controller;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.entity.ScenicDetail;
import com.example.servicescenicspot.entity.ScenicPic;
import com.example.servicescenicspot.service.ScenicService;
import com.example.servicescenicspot.util.BaseUser;
import com.example.servicescenicspot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping(value="/api")  //部署加上
public class ScenicController {

    @Autowired
    ScenicService scenicService;

    @RequestMapping(value="/getScenicSpotList")
    public Map<String,Object> getScenicList(){
        Map<String,Object> result = new HashMap<>();
        List<Scenic> list = scenicService.getScenicList();
        Constants.getErrMsg(result,list);
        return result;
    }

    @RequestMapping(value="/getScenicDetail")
    public Map<String,Object> getScenicDetail(@RequestBody Map<String,String> param){
        Map<String,Object> result = new HashMap<>();
        String scenicId = param.get("id");
        ScenicDetail scenicDetail = scenicService.getScenicDetail(scenicId);
        List<ScenicPic> scenicPics = scenicService.getScenicPic(scenicId);
        scenicDetail.setScenicPicList(scenicPics);
        Constants.getErrMsg(result,scenicDetail);
        return result;
    }

    @RequestMapping(value="/selectScenicByUserId")
    public Map<String,Object> selectScenicByUserId(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        List<Scenic> list = scenicService.selectScenicByUserId(userId);
        Constants.getErrMsg(result,list);
        return result;
    }
}
