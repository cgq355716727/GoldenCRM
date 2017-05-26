package com.yelot.entity;

/**
 * Created by kee on 17/5/15.
 */
public class User {
    private Long id;
    private String name;
    private String password;

    public User(String name,String password){
        this.name = name;
        this.password = password;
    }
}
