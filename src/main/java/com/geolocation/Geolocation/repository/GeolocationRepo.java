package com.geolocation.Geolocation.repository;

import com.geolocation.Geolocation.Geolocation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class GeolocationRepo {

    private List<Geolocation> geoLocations = new ArrayList<Geolocation>();

    public void addGeoLocation(Geolocation geolocation) {
        geoLocations.add(geolocation);
    }

    public List<Geolocation> getGeoLocations() {
        return Collections.unmodifiableList(geoLocations);
    }
}
