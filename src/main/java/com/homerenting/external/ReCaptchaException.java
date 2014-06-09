package com.homerenting.external;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Arthur on 09/06/14.
 */

public class ReCaptchaException extends RuntimeException {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ReCaptchaException.class);

    public static final String COMPONENT_NAME = "reCaptchaException";

    public ReCaptchaException(String message){
        super(message);
    }
}
