package com.example.servicescenicspot.controller;

import com.example.servicescenicspot.entity.UserInfo;
import com.example.servicescenicspot.service.UserService;
import com.example.servicescenicspot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.servicescenicspot.util.JwtUtil;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping(value="/api")
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value="/api/getUserInfo")
    @RequestMapping(value="/getUserInfo")
    public Map<String,Object> getUserInfo(@RequestBody UserInfo userInfo){
        Map<String,Object> result = new HashMap<>();
        UserInfo userInfo1 = userService.getUserInfo(userInfo);
        if(userInfo1 == null){
            Constants.getErrMsg(result,"201");
        }else{
            String token = JwtUtil.CreateToken(userInfo1.getId(),"","","");
            userInfo1.setToken(token);
            Constants.getSuccMsg(result,userInfo1);
        }
        return  result;
    }
}
