package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    TaskList taskList;

//    @Bean
//    public Board getBoard() {
//        return new Board(taskList);
//    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public Board toDoList() {
        Board a = new Board(taskList);
        a.toDoList.addTask("toDo1");
        a.toDoList.addTask("toDo2");
        return a;
    }
    @Bean(name = "inProgress")
    @Scope("prototype")
    public Board inProgressList() {
        Board b = new Board(taskList);
        b.inProgressList.addTask("inProgress1");
        b.inProgressList.addTask("inProgress2");
        return b;
    }
    @Bean(name = "doneList")
    @Scope("prototype")
    public Board doneList() {
        Board c = new Board(taskList);
        c.doneList.addTask("done1");
        c.doneList.addTask("done2");
        return c;
    }
}