package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum PriceFrom {

    50000("50000"),
    100000("100000"),
    150000("150000"),
    200000("200000"),
    MORE_THAN_30000("More than 300000");
    
    private final String value;

    private PriceFrom(String priceFrom) {
        this.value = priceFrom;
    }

    public String getValue(){
        return this.value;
    }
}
