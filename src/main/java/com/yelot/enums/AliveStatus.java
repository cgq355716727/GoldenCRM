package com.yelot.enums;

/**
 * Created by kee on 17/5/28.
 */
public enum AliveStatus {
    ALIVE(1,"在使用状态"),DEAD(0,"已删除状态");

    private int code;
    private String message;

    AliveStatus(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
