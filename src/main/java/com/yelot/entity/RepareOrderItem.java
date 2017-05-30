package com.yelot.entity;

/**
 * Created by kee on 17/5/30.
 */
public class RepareOrderItem {
    private Long id;
    /**
     * 订单项中的商品信息，该字段是否合适，还需要商榷
     */
    private Long product_id;
    /**
     * 订单外键id
     */
    private Long repare_order_id;

    /**
     * 维修内容
     */
    private String repare_detail;

    /**
     * 备注
     */
    private String comment;
}
