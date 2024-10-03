package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Screens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreensRepository extends JpaRepository<Screens , Integer> {
       Screens findByName(String name);
}
