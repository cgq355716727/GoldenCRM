package com.yelot.entity;

import java.util.Date;

/**
 * Created by kee on 17/5/28.
 */
public class Customer {
    private Long id;
    private String name;
    private String phone;
    private String address;
    private int sex;
    private String email;
    private String qq;
    private String comment;
    private int is_alive;
    private Date create_at;
    private Date update_at;

    public Customer(){

    }

    public Customer(String name,String phone,String address,int sex,String email,String qq,String comment){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
        this.email = email;
        this.qq = qq;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIs_alive() {
        return is_alive;
    }

    public void setIs_alive(int is_alive) {
        this.is_alive = is_alive;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
