package com.lime.community.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author mohe
 * @date 2022-02-20 10:55:07
 */
public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    /**
     * 用户类型：0-普通用户; 1-超级管理员; 2-版主
     */
    private int type;
    /**
     * 用户状态：0-未激活; 1-已激活
     */
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date creatTime;

    public User() {
    }

    public User(int id, String username, String password, String salt, String email, int type, int status, String activationCode, String headerUrl, Date creatTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.type = type;
        this.status = status;
        this.activationCode = activationCode;
        this.headerUrl = headerUrl;
        this.creatTime = creatTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", activationCode='" + activationCode + '\'' +
                ", headerUrl='" + headerUrl + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}
