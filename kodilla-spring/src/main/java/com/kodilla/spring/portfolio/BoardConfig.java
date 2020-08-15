package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    TaskList taskList;

    @Bean(name = "toDoList")
    public Board toDoList() {
        return new Board(taskList);
    }
    @Bean(name = "inProgress")
    public Board inProgressList() {
        return new Board(taskList);
    }
    @Bean(name = "doneList")
    public Board doneList() {
        return new Board(taskList);
    }
}