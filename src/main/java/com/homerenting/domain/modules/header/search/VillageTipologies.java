package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum VillageTipologies {

    V1("v1"),
    V2("v2"),
    V3("v3"),
    V4("v4"),
    V5("v5"),
    V6("v6"),
    V6_OR_MORE("v6 or more");

    private final String vilageTipology;

    private VillageTipologies(String vilageTipology) {
        this.vilageTipology = vilageTipology;
    }

    public String getValue(){
        return this.vilageTipology;
    }
}
