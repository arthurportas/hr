package com.homerenting.domain.modules.header.navigation;


public enum EmailTemplates {

    USER_REGISTER_CONFIRMATION("user-register-confirmation-email.ftl"),
    USER_ACCOUNT_ACTIVATION("user-account-activation-email.ftl"),
    PAYMENT_CONFIRMATION("payment-confirmation.ftl"),
    ANNOUNCE_EXPIRED("announce-expired.ftl");


    private final String value;

    private EmailTemplates(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}