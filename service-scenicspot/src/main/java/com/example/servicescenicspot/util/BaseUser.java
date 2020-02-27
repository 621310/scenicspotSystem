package com.example.servicescenicspot.util;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class BaseUser {

    public static String getUser(ServletRequest request){
        HttpServletRequest r = (HttpServletRequest) request;
        String token = r.getHeader("token");
        Map<String,String> user = JwtUtil.verifyToken(token);
        String userId = user.get("userid");
        return userId;
    }
}
