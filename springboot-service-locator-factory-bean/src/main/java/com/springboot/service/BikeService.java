package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Vehicle;
import com.springboot.registry.AdapterService;

@Service("Bike")
public class BikeService implements AdapterService<Vehicle> {
    @Override
    public void process(Vehicle vehicle) {
        System.out.println("inside bike service - " + vehicle.toString());
    }
}
