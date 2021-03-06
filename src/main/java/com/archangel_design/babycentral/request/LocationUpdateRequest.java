package com.archangel_design.babycentral.request;

import java.util.Date;

public class LocationUpdateRequest {

    private Long lat;

    private Long lon;

    private Long alt;

    private Long precision;

    private Date date;

    private String deviceId;

    public Long getLat() {
        return lat;
    }

    public LocationUpdateRequest setLat(Long lat) {
        this.lat = lat;
        return this;
    }

    public Long getLon() {
        return lon;
    }

    public LocationUpdateRequest setLon(Long lon) {
        this.lon = lon;
        return this;
    }

    public Long getAlt() {
        return alt;
    }

    public LocationUpdateRequest setAlt(Long alt) {
        this.alt = alt;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public LocationUpdateRequest setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public LocationUpdateRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public Long getPrecision() {
        return precision;
    }

    public LocationUpdateRequest setPrecision(Long precision) {
        this.precision = precision;
        return this;
    }
}
