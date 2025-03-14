package com.example.Trimble_cars.controller;

import com.example.Trimble_cars.Model.Lease;
import com.example.Trimble_cars.service.LeaseService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(LeaseController.class)
public class LeaseControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LeaseService leaseService;

    @Test
    public void testGetAllLeases() throws Exception {
        mockMvc.perform(get("/leases"))
                .andExpect(status().isOk());
    }

    @Test
    public void testStartLease() throws Exception {
        Lease lease = new Lease();
        lease.setId(1L);

        Mockito.when(leaseService.startLease(lease)).thenReturn(lease);

        mockMvc.perform(post("/leases")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\": 1}"))
                .andExpect(status().isOk());
    }

    @Test
    public void testEndLease() throws Exception {
        mockMvc.perform(delete("/leases/1"))
                .andExpect(status().isOk());
    }
}