package com.example.Trimble_cars.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class EndCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "endCustomer")
    private List<Lease> leases;

    public void setName(String alice_brown) {
    }

    public String getName() {
        return name;
    }
}