package com.example.Trimble_cars.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Setter
@Getter
public class CarOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "carOwner")
    private List<Car> cars;


    public void setName(String john_donem) {
    }
    public String getName()
    {
        return name;
    }
}
