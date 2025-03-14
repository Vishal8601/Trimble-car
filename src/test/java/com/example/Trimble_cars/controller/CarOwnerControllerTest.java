package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.CarOwner;
import com.example.Trimble_cars.service.CarOwnerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CarOwnerController.class)
public class CarOwnerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarOwnerService carOwnerService;

    @Test
    public void testGetAllCarOwners() throws Exception {
        mockMvc.perform(get("/car-owners"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRegisterCarOwner() throws Exception {
        CarOwner carOwner = new CarOwner();
        carOwner.setName("John Doe");

        Mockito.when(carOwnerService.registerCarOwner(carOwner)).thenReturn(carOwner);

        mockMvc.perform(post("/car-owners")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"John Doe\"}"))
                .andExpect(status().isOk());
    }
}