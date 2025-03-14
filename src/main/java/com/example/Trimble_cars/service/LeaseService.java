package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.Lease;
import com.example.Trimble_cars.repository.LeaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseService {
    @Autowired
    private LeaseRepository leaseRepository;

    public List<Lease> getAllLeases() {
        return leaseRepository.findAll();
    }

    public Lease startLease(Lease lease) {
        return leaseRepository.save(lease);
    }

    public void endLease(Long leaseId) {
        leaseRepository.deleteById(leaseId);
    }
}