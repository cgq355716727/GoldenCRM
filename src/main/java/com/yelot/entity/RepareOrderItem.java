package com.yelot.entity;

import java.util.Date;

/**
 * Created by kee on 17/5/30.
 */
public class RepareOrderItem {
    private Long id;
    /**
     * 订单项中的商品信息，该字段是否合适，还需要商榷
     */
//    private Long product_id;
    /**
     * 订单外键id
     */
    private Long repare_order_id;

    /**
     * 维修内容
     */
    private String special_need;

    /**
     * 备注
     */
    private String comment;

    private Date create_at;

    private Date update_at;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRepare_order_id() {
        return repare_order_id;
    }

    public void setRepare_order_id(Long repare_order_id) {
        this.repare_order_id = repare_order_id;
    }

    public String getSpecial_need() {
        return special_need;
    }

    public void setSpecial_need(String special_need) {
        this.special_need = special_need;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
