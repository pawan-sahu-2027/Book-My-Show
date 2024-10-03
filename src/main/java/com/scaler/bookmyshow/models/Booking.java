package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class Booking extends BaseModel{
    @ManyToOne
    private User user;
    @OneToMany
    private List<ShowSeat> bookedSeat;

    @OneToOne
    private Payment payment;
    private double amount;
}
