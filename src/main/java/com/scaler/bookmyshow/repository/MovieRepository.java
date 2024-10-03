package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie , Integer>{
         // Movie save (Movie movie);
      Movie findByName(String name);
}
