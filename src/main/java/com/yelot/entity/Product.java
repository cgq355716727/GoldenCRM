package com.yelot.entity;

import java.util.Locale;

/**
 * Created by kee on 17/5/26.
 */
public class Product {
    private Long id;
    private String service_name;
    private String description;
    private String comment;
    private Brand brand;
    private Category category;

    public Product(){

    }

    public Product(String service_name,String description,String  comment){
        this.service_name = service_name;
        this.description = description;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
