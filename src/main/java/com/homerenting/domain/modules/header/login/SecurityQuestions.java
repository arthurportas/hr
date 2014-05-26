package com.homerenting.domain.modules.header.login;

/*NOT IN USE-26/MAY/2014*/
public enum SecurityQuestions {

    FIRST_MOBILE("first mobile"),
    PET_NAME("pet name"),
    MOTHER_NAME("mother name");

    private final String securityQuestion;

    private SecurityQuestions(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getValue(){
        return this.securityQuestion;
    }

}