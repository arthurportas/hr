package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum BusinessType {

    SALE("sale"),
    RENTAL("rental");

    private final String businessType;

    private BusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getValue(){
        return this.businessType;
    }
}
