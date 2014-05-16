package com.homerenting.domain.modules.header.search;

/**
 * Created by Arthur on 17/04/14.
 */
public enum RentalPropertyPriceFrom {

    From_100_000("100.000"),
    From_105_000("105.000");

    private final String priceFrom;

    private RentalPropertyPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public String getValue(){
        return this.priceFrom;
    }
}
