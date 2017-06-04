package com.yelot.entity;

/**
 * 角色的操作权限，RolePrivilegeRef 是左侧菜单操作权限
 * Created by kee on 17/6/5.
 */
public class RoleOperationRef {
    private Long id;
    private Long role_id;
    private int order_new;
    private String order_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public int getOrder_new() {
        return order_new;
    }

    public void setOrder_new(int order_new) {
        this.order_new = order_new;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
