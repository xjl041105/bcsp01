package com.playgame.mapper;

import com.playgame.pojo.Games;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameMapper {

    //查询所有游戏
    List<Games> findAll(Games games);

    //新增游戏信息
    int addGame(Games games);

    //查询游戏名字是否存在
    int selectByName(Games games);
}
