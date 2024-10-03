package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Movie savemovie(Movie movie) {

        Movie savedMovie = movieRepository.save(movie);


        return savedMovie;
    }
}