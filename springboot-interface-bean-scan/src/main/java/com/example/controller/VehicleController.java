package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Vehicle;

@RestController
@RequestMapping("/drive")
public class VehicleController {

    private Vehicle vehicle;

    public VehicleController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @GetMapping
    public String testDrive() {
        return vehicle.drive();
    }
}
