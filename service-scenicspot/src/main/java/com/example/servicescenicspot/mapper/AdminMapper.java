package com.example.servicescenicspot.mapper;


import com.example.servicescenicspot.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {

    List<Order> selectPendingOrder(@Param("userId") String userId);
}
