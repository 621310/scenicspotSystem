package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.Order;

import java.util.List;

public interface OrderService {

    public int addOrder(Order order);

    public List<Order> getMyOrders(String userId);
}
