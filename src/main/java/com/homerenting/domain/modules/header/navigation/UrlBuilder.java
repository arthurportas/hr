package com.homerenting.domain.modules.header.navigation;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.net.URI;

/**
 * Created by Arthur on 28/04/14.
 */

public class UrlBuilder {

    public UrlBuilder buildCloudinaryUrl() {
        return this;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
