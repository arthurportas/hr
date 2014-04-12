package com.homerenting.domain.modules.header.navigation;


public enum  Nav {

    CONTACTS("contacts");

    private final String navEntry;

    private Nav(String navEntry) {
        this.navEntry = navEntry;
    }

    public String getValue(){
        return this.navEntry;
    }

}