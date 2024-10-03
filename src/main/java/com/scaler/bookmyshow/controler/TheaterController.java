package com.scaler.bookmyshow.controler;


import com.scaler.bookmyshow.dto.TheaterDto;
import com.scaler.bookmyshow.exception.ScreenNotFoundAcception;
import com.scaler.bookmyshow.models.Theater;
import com.scaler.bookmyshow.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




    @RestController
    public class TheaterController {
        public TheaterService theaterService;
        @Autowired
        public TheaterController(TheaterService theaterService) {
            this.theaterService = theaterService;
        }
        @PostMapping("/createtheater/")
        public Theater rejesterTheater (@RequestBody TheaterDto theaterDto) throws ScreenNotFoundAcception {
                 Theater theater = theaterService.makeThreater(theaterDto.getTheaterName() ,theaterDto.getRegion() , theaterDto.getScreensList());
                 return  theater;
        }
    }

