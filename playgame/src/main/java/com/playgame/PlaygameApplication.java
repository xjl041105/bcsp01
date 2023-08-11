package com.playgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启事务管理器
public class PlaygameApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygameApplication.class, args);
    }

}
