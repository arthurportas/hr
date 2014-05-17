package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum PropertyStatus {

    NEW("new"),
    USED("used"),
    RESTORED("restored");

    private final String propertyStatus;

    private PropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public String getValue(){
        return this.propertyStatus;
    }
}
