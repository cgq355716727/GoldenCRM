package com.yelot.entity;

/**
 * 该类主要是保存用户选择产品信息的一个快照对象，主要用来显示,一旦创建，其他用户只能读，不能修改
 * 并且该记录有一个主要的外键就是order_item_id
 * Created by kee on 17/6/1.
 */
public class ItemCategoryAttribute {
    private Long id;
    /**
     * 订单项id，外键
     */
    private Long order_item_id;
    /**
     * 分类id
     */
    private Long category_id;
    /**
     * 属性id
     */
    private Long attribute_id;
    /**
     * 分类名称，为冗余字段，方便显示使用
     */
    private String category_name;
    /**
     * 属性名称，为冗余字段，方便显示使用
     */
    private String attribute_name;
    /**
     * 该字段存放真实的值，下拉框存储的下拉框的值；如果是输入文本，则直接保存文本
     */
    private String real_value;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(Long order_item_id) {
        this.order_item_id = order_item_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(Long attribute_id) {
        this.attribute_id = attribute_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public String getReal_value() {
        return real_value;
    }

    public void setReal_value(String real_value) {
        this.real_value = real_value;
    }
}
