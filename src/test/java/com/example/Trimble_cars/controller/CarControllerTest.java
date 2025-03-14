package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.Car;
import com.example.Trimble_cars.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CarController.class)
@ExtendWith(MockitoExtension.class)
public class CarControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CarService carService;

    @Test
    public void testGetAllCars() throws Exception {
        mockMvc.perform(get("/cars"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRegisterCar() throws Exception {
        Car car = new Car();
        car.setModel("Tesla Model S");

        Mockito.when(carService.registerCar(car)).thenReturn(car);

        mockMvc.perform(post("/cars")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"model\": \"Tesla Model S\"}"))
                .andExpect(status().isOk());
    }
}