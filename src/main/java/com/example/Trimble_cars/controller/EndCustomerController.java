package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.EndCustomer;
import com.example.Trimble_cars.service.EndCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/end-customers")
public class EndCustomerController {
    @Autowired
    private EndCustomerService endCustomerService;

    @GetMapping
    public List<EndCustomer> getAllEndCustomers() {
        return endCustomerService.getAllEndCustomers();
    }

    @PostMapping
    public EndCustomer registerEndCustomer(@RequestBody EndCustomer endCustomer) {
        return endCustomerService.registerEndCustomer(endCustomer);
    }
}