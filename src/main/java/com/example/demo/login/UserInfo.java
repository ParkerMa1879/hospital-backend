package com.example.demo.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class UserInfo {

    @Id
    @Column(name = "username")
    private String username;     //账户名

    @Column(name = "password")
    private String password;     //账户密码

    @Column(name = "name")
    private String name;         //用户名

    @Column(name = "roles")
    private String roles;    //权限，在数据库中存储为“admin,watcher”，返回前端时需是数组形式，如['admin','watcher']

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "avatar")
    private String avatar;


    public UserInfo(String username, String password, String name, String roles, String introduction, String avatar) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.roles = roles;
        this.introduction = introduction;
        this.avatar = avatar;
    }

    public UserInfo() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", roles='" + roles + '\'' +
                ", introduction='" + introduction + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
