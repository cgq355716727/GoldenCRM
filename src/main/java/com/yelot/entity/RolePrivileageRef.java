package com.yelot.entity;

/**
 * Created by kee on 17/5/30.
 */
public class RolePrivileageRef {
    private Long id;
    private Long role_id;
    private Long privileage_id;

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

    public Long getPrivileage_id() {
        return privileage_id;
    }

    public void setPrivileage_id(Long privileage_id) {
        this.privileage_id = privileage_id;
    }
}
