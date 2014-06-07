package com.homerenting.domain.helpers;


public enum QueryHelper {

    NEWS("news");

    private final String navEntry;

    private QueryHelper(String navEntry) {
        this.navEntry = navEntry;
    }

    public String getValue(){
        return this.navEntry;
    }

}