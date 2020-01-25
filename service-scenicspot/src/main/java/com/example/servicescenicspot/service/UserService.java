package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.UserInfo;

import java.util.Map;

public interface UserService {

public UserInfo getUserInfo(UserInfo userInfo);

public UserInfo getUserInfoByUserid(String userid);
}
