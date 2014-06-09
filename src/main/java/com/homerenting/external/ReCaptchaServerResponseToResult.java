package com.homerenting.external;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arthur on 09/06/14.
 */
@Service(ReCaptchaServerResponseToResult.COMPONENT_NAME)
public class ReCaptchaServerResponseToResult {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ReCaptchaServerResponseToResult.class);

    public static final String COMPONENT_NAME = "reCaptchaServerResponseToResult";

    public boolean transform(String response) throws ReCaptchaException{

        List<String> responseLines = Arrays.asList(response.split("\n"));
        if(responseLines.contains("true")) {
            return true;
        } else if(responseLines.contains("false")) {
            return false;
        } else {
            throw new ReCaptchaException("Unrecognized response...");
        }
    }
}
