package com.example.servicescenicspot.mapper;


import com.example.servicescenicspot.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    int addOrder(@Param("order")Order order);
}
