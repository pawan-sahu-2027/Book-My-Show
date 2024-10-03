package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Show1 extends BaseModel{
    @ManyToOne
    private Screens screens;
    @ManyToOne
    private Movie movie;
    private Time startTime;
    private Time endTime;



}
