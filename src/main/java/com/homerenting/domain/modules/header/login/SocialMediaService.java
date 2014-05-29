package com.homerenting.domain.modules.header.login;

/*NOT IN USE-26/MAY/2014*/
public enum SocialMediaService {

    FACEBOOK("facebook"),
    TWITTER("twitter");

    private final String socialMediaService;

    private SocialMediaService(String socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    public String getValue(){
        return this.socialMediaService;
    }

}