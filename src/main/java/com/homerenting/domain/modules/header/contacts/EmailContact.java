package com.homerenting.domain.modules.header.contacts;

/**
 * Created by Arthur on 21/04/14.
 */
public class EmailContact {

    private String name;
    private String emailFrom;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
