package com.example.administrator.yaoyue.db;


/**
 * Created by Administrator on 2017/10/26.
 */

public class Activity {
    private int userid;
    private String activityname;
    private String activitytime;
    private String activitycontext;

    public String getActivitycontext() {
        return activitycontext;
    }

    public void setActivitycontext(String activitycontext) {
        this.activitycontext = activitycontext;
    }

    public String getActivitytime() {

        return activitytime;
    }

    public void setActivitytime(String activitytime) {
        this.activitytime = activitytime;
    }

    public String getActivityname() {

        return activityname;
    }

    public void setActivityname(String activityname) {
        activityname = activityname;
    }

    public int getUserid() {

        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
