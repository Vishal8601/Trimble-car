package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.EndCustomer;
import com.example.Trimble_cars.repository.EndCustomerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EndCustomerServiceTest {
    @Mock
    private EndCustomerRepository endCustomerRepository;

    @InjectMocks
    private EndCustomerService endCustomerService;

    @Test
    public void testRegisterEndCustomer() {
        EndCustomer endCustomer = new EndCustomer();
        endCustomer.setName("Alice Brown");

        when(endCustomerRepository.save(endCustomer)).thenReturn(endCustomer);

        EndCustomer savedEndCustomer = endCustomerService.registerEndCustomer(endCustomer);
        assertEquals("Alice Brown", savedEndCustomer.getName());
    }
}