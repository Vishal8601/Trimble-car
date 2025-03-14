package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.CarOwner;
import com.example.Trimble_cars.repository.CarOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarOwnerService {
    @Autowired
    private CarOwnerRepository carOwnerRepository;

    public List<CarOwner> getAllCarOwners() {
        return carOwnerRepository.findAll();
    }

    public CarOwner registerCarOwner(CarOwner carOwner) {
        return carOwnerRepository.save(carOwner);
    }
}