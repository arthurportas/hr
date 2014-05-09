package com.homerenting.domain.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Created by Arthur on 02/05/14.
 */
public class TokenGenerator {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(TokenGenerator.class);

    public static final String getUUID(){
        slf4jLogger.info("==static final String getUUID()==");
        return UUID.randomUUID().toString();
    }
}
