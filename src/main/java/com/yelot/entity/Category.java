package com.yelot.entity;

/**
 * Created by kee on 17/5/26.
 */
public class Category {
    private Long id;
    private String name;
    private int sort;

    public Category(){

    }

    public Category(String name,int sort){
        this.name = name;
        this.sort = sort;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
