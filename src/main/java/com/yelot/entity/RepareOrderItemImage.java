package com.yelot.entity;

/**
 * Created by kee on 17/5/30.
 */
public class RepareOrderItemImage {
    private Long id;
    private String img_path;
    private Long repare_order_item_id;
    private Long repare_order_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public Long getRepare_order_item_id() {
        return repare_order_item_id;
    }

    public void setRepare_order_item_id(Long repare_order_item_id) {
        this.repare_order_item_id = repare_order_item_id;
    }

    public Long getRepare_order_id() {
        return repare_order_id;
    }

    public void setRepare_order_id(Long repare_order_id) {
        this.repare_order_id = repare_order_id;
    }
}
