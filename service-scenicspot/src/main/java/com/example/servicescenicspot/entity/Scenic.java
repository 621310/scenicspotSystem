package com.example.servicescenicspot.entity;
//景区实体类
public class Scenic {

    private String id;
    private String name;
    private String pic;
    private String ticketsPrice;
    private String oldTicketsPrice;
    private String address;
    private String phone;
    private String openTime;
    private String endTime;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTicketsPrice() {
        return ticketsPrice;
    }

    public void setTicketsPrice(String ticketsPrice) {
        this.ticketsPrice = ticketsPrice;
    }

    public String getOldTicketsPrice() {
        return oldTicketsPrice;
    }

    public void setOldTicketsPrice(String oldTicketsPrice) {
        this.oldTicketsPrice = oldTicketsPrice;
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

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
