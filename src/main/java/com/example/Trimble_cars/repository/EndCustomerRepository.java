package com.example.Trimble_cars.repository;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.Model.EndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndCustomerRepository extends JpaRepository<EndCustomer, Long> {
}