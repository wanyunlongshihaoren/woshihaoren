package com.java.demo.domain;

public class MOrder {
    private Integer oId;

    private String oName;

    private String oInfo;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName == null ? null : oName.trim();
    }

    public String getoInfo() {
        return oInfo;
    }

    public void setoInfo(String oInfo) {
        this.oInfo = oInfo == null ? null : oInfo.trim();
    }
}