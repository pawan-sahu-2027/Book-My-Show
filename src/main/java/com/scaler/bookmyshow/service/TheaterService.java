package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.exception.ScreenNotFoundAcception;
import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.repository.RegionRepository;
import com.scaler.bookmyshow.repository.ScreensRepository;
import com.scaler.bookmyshow.repository.SeatRepository;
import com.scaler.bookmyshow.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    private  SeatRepository seatRepository;
    private ScreensRepository screensRepository;
    private RegionRepository regionRepository;
    private TheaterRepository theaterRepository;
    public TheaterService(SeatRepository seatRepository, ScreensRepository screensRepository,RegionRepository regionRepository , TheaterRepository theaterRepository) {
        this.seatRepository = seatRepository;
        this.screensRepository = screensRepository;
         this.regionRepository = regionRepository;
         this.theaterRepository = theaterRepository;
    }
   // @Transactional

    public Theater makeThreater(String name , String region , List<String> screensList) throws ScreenNotFoundAcception {
        Theater theater = new Theater();
        theater.setName(name);
        Region currentRegion  = new Region();
        currentRegion.setName(region);
        regionRepository.save(currentRegion);
        theater.setRegion(currentRegion);

        List<Screens> newScreen = new ArrayList<>();
        for (String t : screensList) {
            Screens screen = new Screens();
            screen.setName(t);
            screensRepository.save(screen);
            newScreen.add(screen);
        }
        theater.setScreensList(newScreen);
          theaterRepository.save(theater);
          theater.setScreensList(makeScreen(screensList));
        return theater;
    }

    private  List<Screens> makeScreen (List<String> screensList) throws ScreenNotFoundAcception {
         List <Screens> newScreenList = new ArrayList<>();
         int n = 1;
         for (String s: screensList){
             Screens newScreen  = screensRepository.findByName(s);

             if (newScreen == null){
                 throw new ScreenNotFoundAcception(" Their is no Screen  found by this name " + s );
             }

             List<Seat> ListOFSeat = new ArrayList<>();
             for (int i = 1;i<3;i++){
                 for (int j=1;j<3;j++){
                     Seat seat = new Seat();
                     seat.setSeatType(SeatType.SILVER);
                     seat.setSeatStatus(SeatStatus.VACANT);
                     seat.setCol1(i);
                     seat.setRow1(j);
                     seat.setSeatnumber(n++);
                     seatRepository.save(seat);
                     ListOFSeat.add(seat);
                 }
             }
             newScreen.setSeatList(ListOFSeat);
         }
        return newScreenList;


    }


}
//public class Seat extends BaseModel {
//    private int row;
//    private int col;
//    private SeatType seatType;
//    private int seatnumber;
//    private SeatStatus seatStatus;
//}