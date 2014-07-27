package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum PriceFrom {

    FIFTY_THOUSAND("50000"),
    ONE_HUNDRED_THOUSAND("100000"),
    ONE_HUNDRED_AND_FIFTY_THOUSAND("150000"),
    TWO_HUNDRED_THOUSAND("200000"),
    MORE_THAN_THREE_HUNDRED_THOUSAND("More than 300000");
    
    private final String value;

    private PriceFrom(String priceFrom) {
        this.value = priceFrom;
    }

    public String getValue(){
        return this.value;
    }
}
