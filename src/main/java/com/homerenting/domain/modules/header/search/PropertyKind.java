package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum PropertyKind {

    APARTMENT("apartment"),
    VILLAGE("village"),
    TERRAIN("terrain"),
    SHOP("shop"),
    OFFICE("office"),
    GARAGE("garage"),
    FARM("farm"),
    WAREHOUSE("warehouse");

    private final String propertyKind;

    private PropertyKind(String propertyKind) {
        this.propertyKind = propertyKind;
    }

    public String getValue(){
        return this.propertyKind;
    }
}
