package com.playgame.service;

import com.playgame.pojo.Games;
import java.util.List;

public interface GameService {

    //查询所有游戏
    List<Games> findAll(Games games);

    //新增游戏信息
    boolean addGame(Games games);

    //查询游戏名字是否存在
    boolean selectByName(Games games);

}
