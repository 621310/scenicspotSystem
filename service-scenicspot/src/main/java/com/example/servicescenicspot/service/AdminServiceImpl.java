package com.example.servicescenicspot.service;


import com.example.servicescenicspot.entity.Order;
import com.example.servicescenicspot.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl extends BaseService implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Order> selectPendingOrder(String userId) {
        List<Order> list = adminMapper.selectPendingOrder(userId);
        return list;
    }

    @Override
    public List<Order> selectAllorder(String userId) {
        List<Order> list = adminMapper.selectAllorder(userId);
        return list;
    }

    @Override
    public Integer selectPendingorderCount(String userId) {
        return adminMapper.selectPendingorderCount(userId);
    }
}
