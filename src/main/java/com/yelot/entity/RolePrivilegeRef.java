package com.yelot.entity;

/**
 * Created by kee on 17/5/30.
 */
public class RolePrivilegeRef {
    private Long id;
    private Long role_id;
    private Long privilege_id;

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

    public Long getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(Long privilege_id) {
        this.privilege_id = privilege_id;
    }
}
