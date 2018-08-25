package com.isoft.model;

public class TJob {
    private String tJobId;

    private String tJobName;

    private String tType;

    private String tJobDescribe;

    private String tSalary;

    private String tExp;

    private String tXueli;

    private String tLocation;

    private String tRenshu;

    private String tAdddate;

    public String gettJobId() {
        return tJobId;
    }

    public void settJobId(String tJobId) {
        this.tJobId = tJobId == null ? null : tJobId.trim();
    }

    public String gettJobName() {
        return tJobName;
    }

    public void settJobName(String tJobName) {
        this.tJobName = tJobName == null ? null : tJobName.trim();
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public String gettJobDescribe() {
        return tJobDescribe;
    }

    public void settJobDescribe(String tJobDescribe) {
        this.tJobDescribe = tJobDescribe == null ? null : tJobDescribe.trim();
    }

    public String gettSalary() {
        return tSalary;
    }

    public void settSalary(String tSalary) {
        this.tSalary = tSalary == null ? null : tSalary.trim();
    }

    public String gettExp() {
        return tExp;
    }

    public void settExp(String tExp) {
        this.tExp = tExp == null ? null : tExp.trim();
    }

    public String gettXueli() {
        return tXueli;
    }

    public void settXueli(String tXueli) {
        this.tXueli = tXueli == null ? null : tXueli.trim();
    }

    public String gettLocation() {
        return tLocation;
    }

    public void settLocation(String tLocation) {
        this.tLocation = tLocation == null ? null : tLocation.trim();
    }

    public String gettRenshu() {
        return tRenshu;
    }

    public void settRenshu(String tRenshu) {
        this.tRenshu = tRenshu == null ? null : tRenshu.trim();
    }

    public String gettAdddate() {
        return tAdddate;
    }

    public void settAdddate(String tAdddate) {
        this.tAdddate = tAdddate == null ? null : tAdddate.trim();
    }
}