package com.example.servicescenicspot.controller;

import com.example.servicescenicspot.entity.UserInfo;
import com.example.servicescenicspot.service.UserService;
import com.example.servicescenicspot.util.BaseUser;
import com.example.servicescenicspot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.servicescenicspot.util.JwtUtil;

import javax.servlet.ServletRequest;
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

    @RequestMapping("getUsername")
    public Map<String,Object> getUsername(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        UserInfo userInfo = userService.getUserInfoByUserid(userId);
        Constants.getSuccMsg(result,userInfo);
        return  result;
    }

    @RequestMapping("register")
    public Map<String,Object> register(@RequestBody UserInfo userInfo){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        Integer i = userService.register(userInfo);
        if(i>0){
            map.put("code",200);
            map.put("data","注册成功，请登录");
        }else{
            map.put("code",201);
            map.put("data","注册失败，请重试");
        }
        Constants.getSuccMsg(result,map);
        return  result;
    }

    @RequestMapping("updateUserMsg")
    public Map<String,Object> updateUserMsg(@RequestBody UserInfo userInfo){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        Integer i = userService.updateUserMsg(userInfo);
        if(i>0){
            map.put("code",200);
            map.put("data","修改成功");
        }else{
            map.put("code",201);
            map.put("data","修改失败");
        }
        Constants.getSuccMsg(result,map);
        return  result;
    }

}
