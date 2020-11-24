package com.example.login.userData;

import java.io.Serializable;

public class UserData {
    private int Id;//用于数据库里面的格式，每添加一个用户就加1，表示第几行数据
    private String userName;//这里的name就是用户的账号了，并不是用户的名字
    private String userPwd;//用户的密码

    public UserData() {
        super();
    }

    //获得用户名
    public String getUserName(){
        return userName;
    }
    //设置用户名
    public void setUserName(String userName){
        this.userName = userName;
    }
    //获取用户的密码
    public String getUserPwd(){
        return userPwd;
    }
    //设置用户的密码
    public void setUserPwd(String userPwd){
        this.userPwd = userPwd;
    }
    //创建结构，方便写入用户的信息
    public UserData(String userName,String userPwd){
        super();
        this.userName = userName;
        this.userPwd = userPwd;
    }

    @Override
    public String toString(){
        return "User{" +
                "userName'" + userName +'\'' +
                ",userPwd='" + userPwd +'\'' +
                '}';
    }
}
