package com.yelot.entity;

/**
 * Created by kee on 17/5/26.
 */
public class Brand {
    private Long id;
    private String brand_name;
    private String description;
    private Category category;

    public Brand(){

    }

    public Brand(String brand_name,String description){
        this.brand_name = brand_name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
