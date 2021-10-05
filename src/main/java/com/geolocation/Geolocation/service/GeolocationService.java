package com.geolocation.Geolocation.service;

import com.geolocation.Geolocation.Geolocation;

import java.util.List;

public interface GeolocationService {

    public Geolocation create(Geolocation geolocation);
    public List<Geolocation> findAll();
}
