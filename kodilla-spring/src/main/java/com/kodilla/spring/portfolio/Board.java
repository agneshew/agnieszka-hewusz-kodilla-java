package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public TaskList taskList;

    public Board(TaskList taskList) {
        this.taskList = taskList;

    }
}
