package com.homerenting.domain.modules.header.security;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Roles {

    ROLE_ANONYMOUS("anonymous"),
    ROLE_USER("user"),
    ROLE_API_USER("api_user"),
    ROLE_ADMIN("admin");

    private final String role;

    private Roles(String role) {
        this.role = role;
    }

    public String getValue(){
        return this.role;
    }
}
