package com.example.servicescenicspot.controller;

import com.example.servicescenicspot.entity.Scenic;
import com.example.servicescenicspot.service.ScenicService;
import com.example.servicescenicspot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
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
}
