package com.futurex.projectx.service;

import com.futurex.projectx.entity.Station;

import java.util.List;

public interface StationService {
    public List<Station> findAll();

    public Station findById(int id);

    public void save(Station station);

    public void deleteById(int id);
}
