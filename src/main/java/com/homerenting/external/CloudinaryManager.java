package com.homerenting.external;

import com.cloudinary.Cloudinary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Arthur on 28/04/14.
 */
public class CloudinaryManager {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(CloudinaryManager.class);

    private Cloudinary cloudinary;

    public void setCloudinary(Cloudinary cloudinary) {
        slf4jLogger.info("==void setCloudinary(Cloudinary cloudinary)==");
        this.cloudinary = cloudinary;
    }

    public void init() {
        slf4jLogger.info("==void init()==");
        CloudinarySingleton.registerCloudinary(cloudinary);
    }

    public void destroy() {
        slf4jLogger.info("==void destroy()==");
        CloudinarySingleton.deregisterCloudinary();
    }
}
