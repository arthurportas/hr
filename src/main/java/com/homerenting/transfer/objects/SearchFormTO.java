package com.homerenting.transfer.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Arthur on 25/04/14.
 */
public class SearchFormTO {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(SearchFormTO.class);

    private String district;
    private String region;
    private String propertyKind;
    private String businessKind;
    private int priceFrom;
    private int priceTo;


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPropertyKind() {
        return propertyKind;
    }

    public void setPropertyKind(String propertyKind) {
        this.propertyKind = propertyKind;
    }

    public String getBusinessKind() {
        return businessKind;
    }

    public void setBusinessKind(String businessKind) {
        this.businessKind = businessKind;
    }

    public int getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(int priceFrom) {
        this.priceFrom = priceFrom;
    }

    public int getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(int priceTo) {
        this.priceTo = priceTo;
    }
}
