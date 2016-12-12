package com.bw.eventbus;

/**
 * Created by asus on 2016/12/12.
 */
public class FirstEvent {
    private String mMsg;//属性
    public FirstEvent(String msg) {//构造方法
        // TODO Auto-generated constructor stub
        this.mMsg = msg;
    }
    public String getMsg(){//get方法
        return mMsg;
    }
}
