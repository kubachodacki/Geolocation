package com.geolocation.Geolocation.service;

import com.geolocation.Geolocation.Geolocation;
import com.geolocation.Geolocation.repository.GeolocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class GeolocationServiceImpl implements GeolocationService {

    @Autowired
    private GeolocationRepo repository;

    @Override
    public Geolocation create(Geolocation geolocation) {
        repository.addGeoLocation(geolocation);
        return geolocation;
    }

    @Override
    public List<Geolocation> findAll() {
        return repository.getGeoLocations();
    }
}
