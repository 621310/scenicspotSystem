package com.example.servicescenicspot.entity;

import java.util.List;


public class ScenicDetail {

    private String id;
    private String name;
    private String address;
    private String phone;
    private String openTime;
    //景区简介
    private String scenicInfo;
    //景区特色
    private String scenicfeatures;
    private String precautions;
    private List<ScenicProject> scenicProjectsList;
    private List<ScenicPic> scenicPicList;


    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getScenicInfo() {
        return scenicInfo;
    }

    public void setScenicInfo(String scenicInfo) {
        this.scenicInfo = scenicInfo;
    }

    public String getScenicfeatures() {
        return scenicfeatures;
    }

    public void setScenicfeatures(String scenicfeatures) {
        this.scenicfeatures = scenicfeatures;
    }

    public List<ScenicProject> getScenicProjectsList() {
        return scenicProjectsList;
    }

    public void setScenicProjectsList(List<ScenicProject> scenicProjectsList) {
        this.scenicProjectsList = scenicProjectsList;
    }

    public List<ScenicPic> getScenicPicList() {
        return scenicPicList;
    }

    public void setScenicPicList(List<ScenicPic> scenicPicList) {
        this.scenicPicList = scenicPicList;
    }
}
