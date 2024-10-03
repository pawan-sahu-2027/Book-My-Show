package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository <Theater , Integer> {
}
