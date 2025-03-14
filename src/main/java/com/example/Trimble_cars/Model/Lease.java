package com.example.Trimble_cars.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Lease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "end_customer_id")
    private EndCustomer endCustomer;

    public void setId(long l) {
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }
}
