package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.CarOwner;
import com.example.Trimble_cars.service.CarOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-owners")
public class CarOwnerController {
    @Autowired
    private CarOwnerService carOwnerService;

    @GetMapping
    public List<CarOwner> getAllCarOwners() {
        return carOwnerService.getAllCarOwners();
    }

    @PostMapping
    public CarOwner registerCarOwner(@RequestBody CarOwner carOwner) {
        return carOwnerService.registerCarOwner(carOwner);
    }
}