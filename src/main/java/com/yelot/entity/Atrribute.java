package com.yelot.entity;

/**
 * Created by kee on 17/5/26.
 */
public class Atrribute {
    private Long id;
    /**
     * 熟悉名称,属性值，唯一
     */
    private String attribute_name;
    /**
     * 属性类别：1：下拉选择，2，文本输入框
     */
    private int type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
