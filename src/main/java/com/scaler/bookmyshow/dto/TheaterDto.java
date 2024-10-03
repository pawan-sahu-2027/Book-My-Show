package com.scaler.bookmyshow.dto;


import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.models.Screens;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class TheaterDto {
    private String theaterName;
    private List<String> screensList;
    private String region;

}
//
//public class Theater extends BaseModel {
//    @OneToMany
//    private List<Screens> screensList;
//
//    @ManyToOne
//    private Region region;
//    private String name;
//}
//blic class Screens extends BaseModel {
//    private String name;
//    @OneToMany
//    private List<Seat> seatList;
//
//public class Seat extends BaseModel {
//    private int row;
//    private int col;
//    private SeatType seatType;
//    private int seatnumber;
//    private SeatStatus seatStatus;
//}
