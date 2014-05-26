package com.homerenting.domain.modules.header.navigation;


public enum EmailTemplates {

    USER_REGISTER_CONFIRMATION("user-register-confirmation-email.ftl"),
    USER_ACCOUNT_ACTIVATION("user-account-activation-email.ftl"),
    PAYMENT_CONFIRMATION("payment-confirmation.ftl"),
    ANNOUNCE_EXPIRED("announce-expired.ftl"),
    PASSWORD_RECOVERY("password-recovery.ftl");

    private final String emailTemplate;

    private EmailTemplates(String emailTemplate) {
        this.emailTemplate = emailTemplate;
    }

    public String getValue(){
        return this.emailTemplate;
    }

}