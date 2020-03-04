package com.futurex.projectx.dao;

import com.futurex.projectx.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}
