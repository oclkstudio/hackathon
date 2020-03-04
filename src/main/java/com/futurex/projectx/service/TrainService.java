package com.futurex.projectx.service;

import com.futurex.projectx.entity.Train;

import java.util.List;

public interface TrainService {
    public List<Train> findAll();

    public Train findById(int id);

    public void save(Train train);

    public void deleteById(int id);
}
