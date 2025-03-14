package com.example.Trimble_cars.repository;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.Model.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOwnerRepository extends JpaRepository<CarOwner, Long> {
}