package com.qf.myBatis.test.entity;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     * 地址编号
     */
    private Integer orderId;

    /**
     * 用户编号
     */
    private Integer orderUserId;

    /**
     * 用户姓名
     */
    private String orderName;

    /**
     * 用户电话
     */
    private Integer orderPhone;

    /**
     * 用户省份
     */
    private String orderLocation;

    /**
     * 用户详细地址
     */
    private String orderDetailAddress;

    /**
     * 0表示未删除，1表示已删除
     */
    private Integer orderStatus;

    /**
     *
     */
    private Integer orderDefault;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(Integer orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getOrderDetailAddress() {
        return orderDetailAddress;
    }

    public void setOrderDetailAddress(String orderDetailAddress) {
        this.orderDetailAddress = orderDetailAddress;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderDefault() {
        return orderDefault;
    }

    public void setOrderDefault(Integer orderDefault) {
        this.orderDefault = orderDefault;
    }
}

