package com.homerenting.external;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Arthur on 09/06/14.
 * Model for message transformation
 */
public class ReCaptchaSecured {

    private String recaptchaChallenge = StringUtils.EMPTY;

    private String recaptchaResponse = StringUtils.EMPTY;

    public String getRecaptchaChallenge() {
        return recaptchaChallenge;
    }

    public void setRecaptchaChallenge(String recaptchaChallenge) {
        this.recaptchaChallenge = recaptchaChallenge;
    }

    public String getRecaptchaResponse() {
        return recaptchaResponse;
    }

    public void setRecaptchaResponse(String recaptchaResponse) {
        this.recaptchaResponse = recaptchaResponse;
    }
}
