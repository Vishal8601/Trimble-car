package com.example.Trimble_cars.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@Data
@Setter
@Getter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String variant;
    private String status; // Ideal, On Lease, On Service
    private LocalDate registeredDate;

    @ManyToOne
    @JoinColumn(name = "car_owner_id")
    private CarOwner carOwner;

    public void setStatus(String status) {
       this.status=status;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public String getStatus(){
        return status;
    }
    public long getId() {
        return id;
    }

    // Setter
    public void setId(long id) {
        this.id = id;
    }


}

