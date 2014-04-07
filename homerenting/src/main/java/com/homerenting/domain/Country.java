package com.homerenting.domain;

public enum Country {

    PORTUGAL("portugal"),
    BRAZIL("brazil"),
    SPAIN("spain");

    private String country;

   private Country(String country){
       this.country = country;
   }

    public String getValue(){
        return this.country;
    }
}
