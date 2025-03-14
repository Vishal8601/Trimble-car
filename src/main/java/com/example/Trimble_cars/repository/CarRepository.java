package com.example.Trimble_cars.repository;

import com.example.Trimble_cars.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
