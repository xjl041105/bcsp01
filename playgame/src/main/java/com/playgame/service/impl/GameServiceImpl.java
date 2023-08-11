package com.playgame.service.impl;

import com.playgame.mapper.GameMapper;
import com.playgame.pojo.Games;
import com.playgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    @Override
    public List<Games> findAll(Games games) {
        return gameMapper.findAll(games);
    }

    @Override
    public boolean addGame(Games games) {
        return gameMapper.addGame(games)>0;
    }

    @Override
    public boolean selectByName(Games games) {
        return gameMapper.selectByName(games)>0;
    }
}
