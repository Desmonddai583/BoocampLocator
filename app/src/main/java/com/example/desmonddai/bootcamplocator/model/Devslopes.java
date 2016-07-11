package com.example.desmonddai.bootcamplocator.model;

/**
 * Created by desmonddai on 7/8/16.
 */
public class Devslopes {

    final String DRAWABLE = "drawable/";

    private float longitude;
    private float latitude;
    private String locationTitle;
    private String locationAddress;
    private String locationImgUrl;

    public String getImgUrl() {
        return DRAWABLE + locationImgUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationImgUrl() {
        return locationImgUrl;
    }

    public Devslopes(float latitude, float longitude, String locationTitle, String locationAddress, String locationImgUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationImgUrl = locationImgUrl;
    }

}
