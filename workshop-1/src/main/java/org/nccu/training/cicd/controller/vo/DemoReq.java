package org.nccu.training.cicd.controller.vo;


public class DemoReq {

    public String userId;

    public DemoReq() {
    }

    public DemoReq(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
