package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    TaskList taskList;

    @Qualifier("toDo")
    @Bean
    public Board toDoList() {
        return new Board(taskList);
    }
    @Qualifier("inProgress")
    @Bean
    public Board inProgressList() {
        return new Board(taskList);
    }
    @Qualifier("doneList")
    @Bean
    public Board doneList() {
        return new Board(taskList);
    }
}