package com.example.Trimble_cars.service;

import com.example.Trimble_cars.Model.Lease;
import com.example.Trimble_cars.repository.LeaseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LeaseServiceTest {
    @Mock
    private LeaseRepository leaseRepository;

    @InjectMocks
    private LeaseService leaseService;

    @Test
    public void testStartLease() {
        Lease lease = new Lease();
        lease.setId(1L);

        when(leaseRepository.save(lease)).thenReturn(lease);

        Lease savedLease = leaseService.startLease(lease);
        assertEquals(1L, savedLease.getId());
    }

    @Test
    public void testEndLease() {
        doNothing().when(leaseRepository).deleteById(1L);

        leaseService.endLease(1L);
        verify(leaseRepository, times(1)).deleteById(1L);
    }
}