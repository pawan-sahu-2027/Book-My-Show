package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.lang.invoke.WrongMethodTypeException;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show1 show;
    private SeatStatus seatStatus;
    @ManyToOne
    private Seat seat;
}
