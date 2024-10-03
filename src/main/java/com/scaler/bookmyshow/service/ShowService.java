package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.exception.IllegalArgumentException;
import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.models.Screens;
import com.scaler.bookmyshow.models.Show1;
import com.scaler.bookmyshow.repository.MovieRepository;
import com.scaler.bookmyshow.repository.ScreensRepository;
import com.scaler.bookmyshow.repository.ShowRepository;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class ShowService {

    private ShowRepository showRepository;
    private ScreensRepository screensRepository;
    private MovieRepository movieRepository;
    public ShowService (ShowRepository showRepository , ScreensRepository screensRepository , MovieRepository movieRepository){
        this . showRepository = showRepository;
        this.movieRepository = movieRepository;
        this.screensRepository = screensRepository;
    }

    public Show1 createShow (String screens , String movie , Time startTime , Time endTime) throws IllegalArgumentException {
        Screens screens1   = screensRepository.findByName(screens);
        Movie   movie1     = movieRepository.findByName(movie);
        if ((screens1 == null) || (movie1 == null)){
            throw new IllegalArgumentException("their is no argument present of this name ");
        }

        Show1 show1 = new Show1();
        show1.setMovie(movie1);
        show1.setScreens(screens1);
        show1.setStartTime(startTime);
        show1.setEndTime(endTime);
        showRepository.save(show1);
        return show1;

    }
}

