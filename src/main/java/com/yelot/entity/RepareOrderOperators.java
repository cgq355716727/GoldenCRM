package com.yelot.entity;

import java.util.Date;

/**
 * 审核记录表，操作详情记录表
 * Created by kee on 17/5/30.
 */
public class RepareOrderOperators {
    private Long id;
    private Long repare_order_id;
    private Long approve_user_id;
    private String operator_comment;
    private int operator_status;
    private Date create_at;

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

    public Long getApprove_user_id() {
        return approve_user_id;
    }

    public void setApprove_user_id(Long approve_user_id) {
        this.approve_user_id = approve_user_id;
    }

    public String getOperator_comment() {
        return operator_comment;
    }

    public void setOperator_comment(String operator_comment) {
        this.operator_comment = operator_comment;
    }

    public int getOperator_status() {
        return operator_status;
    }

    public void setOperator_status(int operator_status) {
        this.operator_status = operator_status;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
}
