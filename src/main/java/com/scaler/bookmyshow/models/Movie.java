package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


import java.time.Duration;
import java.time.LocalTime;

@Entity
@Setter
@Getter
public class Movie extends BaseModel{
    private String name;
    private LocalTime time;
    private double rating;

}
