package com.homerenting.external;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arthur on 09/06/14.
 */
@Service(ReCaptchaFormToHttpRequest.COMPONENT_NAME)
public class ReCaptchaFormToHttpRequest {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(ReCaptchaFormToHttpRequest.class);

    public static final String COMPONENT_NAME = "reCaptchaFormToHttpRequest";

    private HttpServletRequest servletRequest;

    @Value("${recaptcha_private_key}")
    private String recaptchaPrivateKey;


    public Map<String, String> transform(ReCaptchaSecured form) throws ReCaptchaException{

        Map<String, String> map = new HashMap<String, String>();
        map.put("privatekey", recaptchaPrivateKey);
        map.put("remoteip", getServletRequest().getRemoteAddr());
        map.put("challenge", form.getRecaptchaChallenge());
        map.put("response", form.getRecaptchaResponse());
        return map;
    }

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
}
