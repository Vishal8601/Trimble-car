package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.Lease;
import com.example.Trimble_cars.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leases")
public class LeaseController {
    @Autowired
    private LeaseService leaseService;

    @GetMapping
    public List<Lease> getAllLeases() {
        return leaseService.getAllLeases();
    }

    @PostMapping
    public Lease startLease(@RequestBody Lease lease) {
        return leaseService.startLease(lease);
    }

    @DeleteMapping("/{leaseId}")
    public void endLease(@PathVariable Long leaseId) {
        leaseService.endLease(leaseId);
    }
}