package com.homerenting.domain;

public enum UserType {

    PRIVATE("private"),
    REAL_STATE("real state");

    private String userType;

   private UserType(String userType){
       this.userType = userType;
   }

    public String getValue(){
        return this.userType;
    }
}
