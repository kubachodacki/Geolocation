package com.geolocation.Geolocation;

import java.io.Serializable;

public class Geolocation implements Serializable {

    private double latitude;
    private double longitude;
    private int deviceId;

    public double getLatitude() {return latitude;}

    public void setLatitude(double latitude) {this.latitude = latitude;}

    public double getLongitude() {return longitude;}

    public void setLongitude(double longitude) {this.longitude = longitude;}

    public int getDeviceId() {return deviceId;}

    public void setDeviceId(int deviceId) {this.deviceId = deviceId;}

}
