package com.example.servicescenicspot.component;

import com.example.servicescenicspot.entity.UserInfo;
import com.example.servicescenicspot.service.BaseService;
import com.example.servicescenicspot.service.UserService;
import com.example.servicescenicspot.util.JwtUtil;
import com.example.servicescenicspot.util.util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    public static String userid;


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("token").toString();
        if (token.equals("")) {
            return false;
        }
        Map<String,String> userInfo = JwtUtil.verifyToken(token);
        String userid = userInfo.get("userid");
        util.userid = userid;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
