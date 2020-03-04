package com.futurex.projectx.service;

import com.futurex.projectx.entity.Direction;

import java.util.List;

public interface DirectionService {
    public List<Direction> findAll();

    public Direction findById(int id);

    public void save(Direction direction);

    public void deleteById(int id);
}
