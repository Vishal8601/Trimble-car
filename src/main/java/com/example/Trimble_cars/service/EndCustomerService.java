package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.EndCustomer;
import com.example.Trimble_cars.repository.EndCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndCustomerService {
    @Autowired
    private EndCustomerRepository endCustomerRepository;

    public List<EndCustomer> getAllEndCustomers() {
        return endCustomerRepository.findAll();
    }

    public EndCustomer registerEndCustomer(EndCustomer endCustomer) {
        return endCustomerRepository.save(endCustomer);
    }
}