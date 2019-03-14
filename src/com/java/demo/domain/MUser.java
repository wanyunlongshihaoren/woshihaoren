package com.java.demo.domain;

public class MUser {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private Integer uMoney;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuMoney() {
        return uMoney;
    }

    public void setuMoney(Integer uMoney) {
        this.uMoney = uMoney;
    }
}