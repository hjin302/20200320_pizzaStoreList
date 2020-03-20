package com.example.a20200320_pizzastorelist.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {
    private String stroeName;
    private String logoUrl;
    private String phoneNum;

    public PizzaStore(String stroeName, String logoUrl, String phoneNum) {
        this.stroeName = stroeName;
        this.logoUrl = logoUrl;
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStroeName() {
        return stroeName;
    }

    public void setStroeName(String stroeName) {
        this.stroeName = stroeName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public PizzaStore(String stroeName) {
        this.stroeName = stroeName;
    }
}
