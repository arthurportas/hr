package com.homerenting.domain.modules.header.navigation;


public enum  Nav {

    NEWS("news"),
    PROFESSIONALS("professionals"),
    FINANCING("financing"),
    SERVICES("services"),
    LAW("law"),
    CONTACTS("contacts");

    private final String navEntry;

    private Nav(String navEntry) {
        this.navEntry = navEntry;
    }

    public String getValue(){
        return this.navEntry;
    }

}