package com.cywang.code.entity;

import com.cywang.code.support.BaseEntity;

public class User extends BaseEntity {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 证件号码
     */
    private String idNo;
    /**
     * 证件类型， 1-身份证， 2-护照， 3-驾驶证
     */
    private String idType;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", idNo='" + idNo + '\'' +
                ", idType='" + idType + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }
}
