package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.CarOwner;
import com.example.Trimble_cars.repository.CarOwnerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarOwnerServiceTest {
    @Mock
    private CarOwnerRepository carOwnerRepository;

    @InjectMocks
    private CarOwnerService carOwnerService;

    @Test
    public void testRegisterCarOwner() {
        CarOwner carOwner = new CarOwner();
        carOwner.setName("John Doe");

        when(carOwnerRepository.save(carOwner)).thenReturn(carOwner);

        CarOwner savedCarOwner = carOwnerService.registerCarOwner(carOwner);
        assertEquals("John Doe", savedCarOwner.getName());
    }
}