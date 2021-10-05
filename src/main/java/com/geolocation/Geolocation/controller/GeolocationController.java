package com.geolocation.Geolocation.controller;

import com.geolocation.Geolocation.Geolocation;
import com.geolocation.Geolocation.service.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geolocation")
public class GeolocationController {

    @Autowired
    private GeolocationService service;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Geolocation create(@RequestBody Geolocation geolocation) {
        return service.create(geolocation);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Geolocation> findAll() {
        return service.findAll();
    }
}
