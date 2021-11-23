package org.nccu.training.cicd.controller.vo;

public class DemoResp {

    public Integer statusCode;

    public String responseMessage;

    public DemoResp() {
    }

    public DemoResp(Integer statusCode, String responseMessage) {
        this.statusCode = statusCode;
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
