package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarServiceTest {
    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;

    @Test
    public void testRegisterCar() {
        Car car = new Car();
        car.setModel("Tesla Model S");

        when(carRepository.save(car)).thenReturn(car);

        Car savedCar = carService.registerCar(car);
        assertEquals("Tesla Model S", savedCar.getModel());
    }

    @Test
    public void testUpdateCarStatus() {
        Car car = new Car();
        car.setId(1L);
        car.setStatus("Ideal");

        when(carRepository.findById(1L)).thenReturn(Optional.of(car));
        when(carRepository.save(car)).thenReturn(car);

        Car updatedCar = carService.updateCarStatus(1L, "On Lease");
        assertEquals("On Lease", updatedCar.getStatus());
    }
}