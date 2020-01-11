package com.example.servicescenicspot.common;

/**
 *@author fyy
 */
public class PageUtil {

    private int pageIndex = 1;
    private int pageSize = 10;
    private int beginIndex;
    private int endIndex;
    private int totalPage;
    private  int totalNum;

    public PageUtil(int pageIndex, int pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.beginIndex =  ( (this.pageIndex -1) * this.pageSize ) + 1;
        this.endIndex =  pageIndex * pageSize;
    }
    public PageUtil(int pageIndex, int pageSize,int totalNum) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.beginIndex =  ( (this.pageIndex -1) * this.pageSize ) + 1;
        this.endIndex =  pageIndex * pageSize;
        this.totalPage = totalNum % pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
        this.totalNum=totalNum;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
