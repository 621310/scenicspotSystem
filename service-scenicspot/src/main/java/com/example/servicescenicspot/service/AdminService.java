package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Order;

import java.util.List;

public interface AdminService {

    List<Order> selectPendingOrder(String userId);

    List<Order> selectAllorder(String userId);

    Integer selectPendingorderCount(String userId);
}
