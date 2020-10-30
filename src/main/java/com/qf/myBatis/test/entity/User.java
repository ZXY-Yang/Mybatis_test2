package com.qf.myBatis.test.entity;

import java.io.Serializable;

public class User extends Address implements Serializable {
    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 0表示该地址已删除 1表示存在
     */
    private Integer userStatus;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}

