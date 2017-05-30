package com.yelot.entity;

/**
 * Created by kee on 17/5/30.
 */
public class ProductAttributeRef {
    private Long id;
    private Long product_id;
    private Long attribute_id;
    private Long attribute_value_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(Long attribute_id) {
        this.attribute_id = attribute_id;
    }

    public Long getAttribute_value_id() {
        return attribute_value_id;
    }

    public void setAttribute_value_id(Long attribute_value_id) {
        this.attribute_value_id = attribute_value_id;
    }
}
