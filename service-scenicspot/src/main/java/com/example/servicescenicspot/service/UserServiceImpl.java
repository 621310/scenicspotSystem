package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.UserInfo;
import com.example.servicescenicspot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("userService")
public class UserServiceImpl  extends BaseService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        UserInfo userInfo1 = userMapper.getUserInfo(userInfo);
        if(userInfo1 != null){
            this.usr = userInfo1;
        }
        return userInfo1;
    }
}
