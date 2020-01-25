package com.example.servicescenicspot.mapper;

import com.example.servicescenicspot.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    UserInfo getUserInfo(@Param("userInfo") UserInfo userInfo);

    UserInfo getUserInfoByUserid(@Param("userid")String userid);
}
