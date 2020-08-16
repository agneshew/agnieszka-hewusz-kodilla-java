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

    @Bean(name = "toDoList")
    public Board toDoList() {
        Board a = new Board(taskList);
        a.toDoList.tasks.add("task1");
        //b.toDoList.tasks.add("toDoList2");
        return a;
    }
    @Bean(name = "inProgress")
    public Board inProgressList() {
        Board b = new Board(taskList);
        b.inProgressList.tasks.add("task2");
        //b.toDoList.tasks.add("task2");
        return b;
    }
    @Bean(name = "doneList")
    public Board doneList() {
        Board c = new Board(taskList);
        c.doneList.tasks.add("task3");
        //b.toDoList.tasks.add("task2");
        return c;
    }
}