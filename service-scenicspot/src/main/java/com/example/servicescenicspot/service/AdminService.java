package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Order;

import java.util.List;

public interface AdminService {

    List<Order> selectPendingOrder(String userId);
}
