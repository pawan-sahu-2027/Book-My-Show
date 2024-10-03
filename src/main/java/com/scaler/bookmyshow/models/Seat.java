package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seat extends  BaseModel{
    private int row1;
    private int col1;
    private SeatType seatType;
    private int seatnumber;
    private SeatStatus seatStatus;
}
