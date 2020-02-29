package com.example.servicescenicspot.mapper;


import com.example.servicescenicspot.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    int addOrder(@Param("order")Order order);

    List<Order> getMyOrders(@Param("userId")String userId);

    Order getOrderDetail(@Param("orderId") String orderId);
}
