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

    private final String value;

    private PropertyKind(String propertyKind) {
        this.value = propertyKind;
    }

    public String getValue(){
        return this.value;
    }
}
