package com.example.servicescenicspot.controller;


import com.example.servicescenicspot.common.UUIDGenerator;
import com.example.servicescenicspot.entity.Order;
import com.example.servicescenicspot.service.OrderService;
import com.example.servicescenicspot.util.BaseUser;
import com.example.servicescenicspot.util.Constants;
import com.example.servicescenicspot.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping(value="/api")  //部署加上
public class OrderController {

    @Autowired
    OrderService orderService;

    //新增一个订单
    @RequestMapping("addOrder")
    public Map<String,Object> addOrder(@RequestBody Order order, ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        order.setCode(UUIDGenerator.getOrderCode());
        String userId = BaseUser.getUser(request);
        order.setUserId(userId);
        order.setOrderStatus(0);
        order.setTotal(order.getNum() * order.getProjectPrice());
        int i = orderService.addOrder(order);
        if(i>0){
            map.put("code",200);
            map.put("data","添加成功，可前往我的订单完成支付");
        }else{
            map.put("code",201);
            map.put("data","添加失败，请稍后重试");
        }
        Constants.getSuccMsg(result,map);
        return result;
    }

    //查询我的订单
    @RequestMapping("getMyOrders")
    public Map<String,Object> getMyOrders(ServletRequest request){
        Map<String,Object> result = new HashMap<>();
        String userId = BaseUser.getUser(request);
        List<Order> orderList = orderService.getMyOrders(userId);
        Constants.getSuccMsg(result,orderList);
        return result;
    }

}
