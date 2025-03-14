package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car registerCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCarStatus(Long carId, String status) {
        Car car = carRepository.findById(carId).orElseThrow(() -> new RuntimeException("Car not found"));
        car.setStatus(status);
        return carRepository.save(car);
    }
}