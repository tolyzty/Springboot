package com.ace.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userUsername;

    private String userPassword;

    private String userPaypassword;

    private String userCardid;

    private String userRealname;

    private String userEmail;

    private String userPhone;

    private Integer userSfrz;

    private Integer userSjrz;

    private Integer userYxrz;

    private String userDqjf;

    private Date userZxdlsj;

    private Integer userQq;

    private Date userAddtime;

    private Date userLasttime;

    private String userAddip;

    private Integer userZt;

    public Integer getUserZt() { return userZt;}

    public void setUserZt(Integer userZt) {this.userZt = userZt;}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPaypassword() {
        return userPaypassword;
    }

    public void setUserPaypassword(String userPaypassword) {
        this.userPaypassword = userPaypassword == null ? null : userPaypassword.trim();
    }

    public String getUserCardid() {
        return userCardid;
    }

    public void setUserCardid(String userCardid) {
        this.userCardid = userCardid == null ? null : userCardid.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserSfrz() {
        return userSfrz;
    }

    public void setUserSfrz(Integer userSfrz) {
        this.userSfrz = userSfrz;
    }

    public Integer getUserSjrz() {
        return userSjrz;
    }

    public void setUserSjrz(Integer userSjrz) {
        this.userSjrz = userSjrz;
    }

    public Integer getUserYxrz() {
        return userYxrz;
    }

    public void setUserYxrz(Integer userYxrz) {
        this.userYxrz = userYxrz;
    }

    public String getUserDqjf() {
        return userDqjf;
    }

    public void setUserDqjf(String userDqjf) {
        this.userDqjf = userDqjf == null ? null : userDqjf.trim();
    }

    public Date getUserZxdlsj() {
        return userZxdlsj;
    }

    public void setUserZxdlsj(Date userZxdlsj) {
        this.userZxdlsj = userZxdlsj;
    }

    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    public Date getUserAddtime() {
        return userAddtime;
    }

    public void setUserAddtime(Date userAddtime) {
        this.userAddtime = userAddtime;
    }

    public Date getUserLasttime() {
        return userLasttime;
    }

    public void setUserLasttime(Date userLasttime) {
        this.userLasttime = userLasttime;
    }

    public String getUserAddip() {
        return userAddip;
    }

    public void setUserAddip(String userAddip) {
        this.userAddip = userAddip == null ? null : userAddip.trim();
    }
}
