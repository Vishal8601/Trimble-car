package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.EndCustomer;
import com.example.Trimble_cars.service.EndCustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EndCustomerController.class)
public class EndCustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EndCustomerService endCustomerService;

    @Test
    public void testGetAllEndCustomers() throws Exception {
        mockMvc.perform(get("/end-customers"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRegisterEndCustomer() throws Exception {
        EndCustomer endCustomer = new EndCustomer();
        endCustomer.setName("Alice Brown");

        Mockito.when(endCustomerService.registerEndCustomer(endCustomer)).thenReturn(endCustomer);

        mockMvc.perform(post("/end-customers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\": \"Alice Brown\"}"))
                .andExpect(status().isOk());
    }
}