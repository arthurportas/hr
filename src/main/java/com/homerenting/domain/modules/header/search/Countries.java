package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum Countries {

    PORTUGAL("Portugal"),
    SPAIN("Spain"),
    BRAZIL("Brazil");

    private final String value;

    private Countries(String country) {
        this.value = country;
    }

    public String getValue(){
        return this.value;
    }
}
