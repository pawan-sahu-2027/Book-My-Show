package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User , Integer> {
    Optional< User > findById (int id);
    // User saveUser (User user);
}
