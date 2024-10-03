package com.scaler.bookmyshow.dto;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.models.Screens;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
@Setter
@Getter
public class ShowDto {

    private String screen;
    private String movie;
    private Time startTime;
    private Time endTime;


}
