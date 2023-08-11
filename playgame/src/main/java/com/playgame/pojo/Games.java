package com.playgame.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Games implements Serializable {
    //游戏编号
    private Long gameId;
    //游戏名称
    private String gameName;
    //游戏类型
    private String gameType;
    //发行公司
    private String gameCompany;
    //发行年份
    private Integer gameYear;

    public Games(String gameName, String gameType, String gameCompany, Integer gameYear) {
        this.gameName = gameName;
        this.gameType = gameType;
        this.gameCompany = gameCompany;
        this.gameYear = gameYear;
    }
}
