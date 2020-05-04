package com.example.servicescenicspot.controller;


/*
* 景区管理员
* */

import com.example.servicescenicspot.entity.Order;
import com.example.servicescenicspot.service.AdminService;
import com.example.servicescenicspot.util.BaseUser;
import com.example.servicescenicspot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping(value="/api")  //部署加上
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("selectPendingOrder")
    public Map<String,Object> selectPendingOrder(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        List<Order> list = adminService.selectPendingOrder(userId);
        Constants.getSuccMsg(result,list);
        return result;
    }

    @RequestMapping("selectAllorder")
    public Map<String,Object> selectAllorder(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        List<Order> list = adminService.selectAllorder(userId);
        Constants.getSuccMsg(result,list);
        return result;
    }

    @RequestMapping("selectPendingorderCount")
    public Map<String,Object> selectPendingorderCount(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        Integer i = adminService.selectPendingorderCount(userId);
        Constants.getSuccMsg(result,i);
        return result;
    }
}
