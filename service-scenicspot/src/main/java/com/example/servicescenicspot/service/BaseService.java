package com.example.servicescenicspot.service;

import com.example.servicescenicspot.entity.UserInfo;

public class BaseService {

    protected UserInfo usr;

    public UserInfo getUsr() {
        return usr;
    }

    public void setUsr(UserInfo usr) {
        if( this.usr==null || (usr!=null && this.usr.getId()!=usr.getId()  )) {
            this.usr = usr;
        }
    }
}
