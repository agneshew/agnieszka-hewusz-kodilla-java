package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }
    @Bean
    public Board toDoList() {
        return new Board(taskList);
    }
    @Bean
    public Board inProgressList() {
        return new Board(taskList);
    }
    @Bean
    public Board doneList() {
        return new Board(taskList);
    }
}