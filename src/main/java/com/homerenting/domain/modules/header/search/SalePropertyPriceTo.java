package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum SalePropertyPriceTo {

    To_100_000("100.000"),
    To_105_000("105.000");

    private final String priceTo;

    private SalePropertyPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public String getValue(){
        return this.priceTo;
    }
}
