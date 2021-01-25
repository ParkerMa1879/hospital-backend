package com.example.demo.login;

/**
 * 与UserInfo相比，多了token，少了password
 * */
public class UserWithToken {

    private String username;     //账户名

    private String name;         //用户名

    private String roles;    //权限，在数据库中存储为“admin,watcher”，返回前端时需是数组形式，如['admin','watcher']

    private String introduction;

    private String avatar;

    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public void setUserToken(UserInfo user, String token) {
        this.username = user.getUsername();
        this.roles = user.getRoles();
        this.avatar = user.getAvatar();
        this.introduction = user.getIntroduction();
        this.name = user.getName();
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserWithToken{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", roles='" + roles + '\'' +
                ", introduction='" + introduction + '\'' +
                ", avatar='" + avatar + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
