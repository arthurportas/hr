package com.homerenting.external;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Arthur on 09/06/14.
 */
public interface ReCaptchaVerifier {

    boolean validate(ReCaptchaSecured reCaptchaRequest);
}
