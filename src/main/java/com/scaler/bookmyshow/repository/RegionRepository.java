package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaParameters;
import org.springframework.data.relational.core.sql.In;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}
