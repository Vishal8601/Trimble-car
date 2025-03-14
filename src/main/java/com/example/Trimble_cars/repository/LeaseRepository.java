package com.example.Trimble_cars.repository;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.Model.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepository extends JpaRepository<Lease, Long> {
}