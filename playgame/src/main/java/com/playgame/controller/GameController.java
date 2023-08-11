package com.playgame.controller;

import com.playgame.pojo.Games;
import com.playgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;
    @RequestMapping("findAll")
    public List<Games> findAll(String gameName,String gameType,String gameCompany,String gameYear) {
        Games games=new Games(gameName,gameType,gameCompany,Integer.parseInt(gameYear));
        return gameService.findAll(games);
    }
}
