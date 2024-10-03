package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat , Integer> {
    interface RegionRepository extends JpaRepository<Region, Integer> {
    }
}
