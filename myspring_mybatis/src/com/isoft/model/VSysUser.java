package com.isoft.model;

public class VSysUser {
    private String tUserId;

    private String tUserName;

    private String tUserPwd;

    private String tUserState;

    public String gettUserId() {
        return tUserId;
    }

    public void settUserId(String tUserId) {
        this.tUserId = tUserId == null ? null : tUserId.trim();
    }

    public String gettUserName() {
        return tUserName;
    }

    public void settUserName(String tUserName) {
        this.tUserName = tUserName == null ? null : tUserName.trim();
    }

    public String gettUserPwd() {
        return tUserPwd;
    }

    public void settUserPwd(String tUserPwd) {
        this.tUserPwd = tUserPwd == null ? null : tUserPwd.trim();
    }

    public String gettUserState() {
        return tUserState;
    }

    public void settUserState(String tUserState) {
        this.tUserState = tUserState == null ? null : tUserState.trim();
    }
}