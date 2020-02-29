package com.example.servicescenicspot.service;


import com.example.servicescenicspot.entity.Order;
import com.example.servicescenicspot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl extends BaseService implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public int addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    @Override
    public List<Order> getMyOrders(String userId) {
        return orderMapper.getMyOrders(userId);
    }

    @Override
    public Order getOrderDetail(String orderId) {
        return orderMapper.getOrderDetail(orderId);
    }
}
