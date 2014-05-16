package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum SalePropertyPriceFrom {

    From_100_000("100.000"),
    From_105_000("105.000");

    private final String priceFrom;

    private SalePropertyPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getValue(){
        return this.priceFrom;
    }
}
