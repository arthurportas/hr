package com.homerenting.external;

import com.cloudinary.Cloudinary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Arthur on 28/04/14.
 */
@Component(CloudinarySingleton.COMPONENT_NAME)
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class CloudinarySingleton {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(CloudinarySingleton.class);

    public static final String COMPONENT_NAME = "cloudinary";

    private static Cloudinary cloudinary;

    public static void registerCloudinary(Cloudinary cloudinary) {
        slf4jLogger.info("==static void registerCloudinary(Cloudinary cloudinary)==");
        CloudinarySingleton.cloudinary = cloudinary;
    }

    public static void deregisterCloudinary() {
        slf4jLogger.info("==static void deregisterCloudinary()==");
        cloudinary = null;
    }

    public static Cloudinary getCloudinary() {
        slf4jLogger.info("==static Cloudinary getCloudinary()==");
        return cloudinary;
    }

}
