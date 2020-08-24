package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Vehicle;
import com.springboot.registry.AdapterService;

@Service("Car")
public class CarService implements AdapterService<Vehicle> {
    @Override
    public void process(Vehicle vehicle) {
        System.out.println("inside car service - " + vehicle.toString());
    }
}
