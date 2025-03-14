package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public Car registerCar(@RequestBody Car car) {
        return carService.registerCar(car);
    }

    @PutMapping("/{carId}/status")
    public Car updateCarStatus(@PathVariable Long carId, @RequestParam String status) {
        return carService.updateCarStatus(carId, status);
    }
}