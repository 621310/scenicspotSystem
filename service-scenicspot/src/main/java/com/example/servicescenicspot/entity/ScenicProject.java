package com.example.servicescenicspot.entity;

public class ScenicProject {
    private String id;
    private String name;
    private String projectPrice;
    private String openTime;
    private String note;

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(String projectPrice) {
        this.projectPrice = projectPrice;
    }
}
