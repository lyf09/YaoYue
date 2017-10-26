package com.example.administrator.yaoyue.db;


/**
 * Created by Administrator on 2017/10/26.
 */

public class Users {
    private int userid;
    private String userpassword;
    private String email;
    private String sex;
    private int age;
    private String update;
    private String cratedate;


    public int getUserid() {

        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPassword() {

        return userpassword;
    }
    public void setPassword(String password) {
        this.userpassword = password;
    }

    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {

        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getUpdate() {

        return update;
    }
    public void setUpdate(String update) {
        this.update = update;
    }

    public String getCratedate() {

        return cratedate;
    }
    public void setCratedate(String cratedate) {
        this.cratedate = cratedate;
    }





}
