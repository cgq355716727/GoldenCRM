package com.yelot.entity;

import java.util.Date;

/**
 * Created by kee on 17/5/30.
 */
public class RepareOrder {
    private Long id;
    /**
     * 订单编号，编码规则待定：
     */
    private String order_no;

    /**
     * 该字段为冗余字段，主要是为了统计方便（快速获得shop_id），通过create_user_id还需要经过一次查询
     */
    private Long shop_id;

    /**
     * 订单状态
     */
    private int status;
    /**
     * 订单创建者
     */
    private Long create_user_id;

    /**
     * 订单上一个审核者id
     */
    private Long last_approve_user_id;

    /**
     * 当前订单待审核者，订单当前状态，所有者，要审核订单的用户id
     */
    private Long approve_user_id;

    /**
     * 交货日期,预估的时间
     */
    private Date delivery_at;

    /**
     * 交货方式：上门自取，快递邮寄
     */
    private int delivery_type;

    /**
     * 客户的id,要把用户信息先插入表t_customer中
     */
    private Long customer_id;

    /**
     * 客户名称
     */
    private String customer_name;

    /**
     * 客户手机号
     */
    private String customer_phone;

    /**
     * 客户地址
     */
    private String customer_address;

    /**
     * 预付款,保留小数2位，存到数据库中扩大100倍
     */
    private int advance_payment;

    /**
     * 未付款，代付款，这个值一般需要后期维修鉴定后才能填写完成
     */
    private int non_payment;

    /**
     * 付款方式：现金，刷卡，支付宝，微信等
     */
    private int advance_payment_type;

    /**
     * 总价
     */
    private int total_payment;

    /**
     * 未付款付款方式，待扩展使用
     */
    private int non_payment_type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Long getLast_approve_user_id() {
        return last_approve_user_id;
    }

    public void setLast_approve_user_id(Long last_approve_user_id) {
        this.last_approve_user_id = last_approve_user_id;
    }

    public Long getApprove_user_id() {
        return approve_user_id;
    }

    public void setApprove_user_id(Long approve_user_id) {
        this.approve_user_id = approve_user_id;
    }

    public Date getDelivery_at() {
        return delivery_at;
    }

    public void setDelivery_at(Date delivery_at) {
        this.delivery_at = delivery_at;
    }

    public int getDelivery_type() {
        return delivery_type;
    }

    public void setDelivery_type(int delivery_type) {
        this.delivery_type = delivery_type;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getAdvance_payment() {
        return advance_payment;
    }

    public void setAdvance_payment(int advance_payment) {
        this.advance_payment = advance_payment;
    }

    public int getNon_payment() {
        return non_payment;
    }

    public void setNon_payment(int non_payment) {
        this.non_payment = non_payment;
    }

    public int getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(int total_payment) {
        this.total_payment = total_payment;
    }

    public int getAdvance_payment_type() {
        return advance_payment_type;
    }

    public void setAdvance_payment_type(int advance_payment_type) {
        this.advance_payment_type = advance_payment_type;
    }

    public int getNon_payment_type() {
        return non_payment_type;
    }

    public void setNon_payment_type(int non_payment_type) {
        this.non_payment_type = non_payment_type;
    }
}
