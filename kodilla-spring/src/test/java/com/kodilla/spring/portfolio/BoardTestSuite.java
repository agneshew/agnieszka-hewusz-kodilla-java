package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void BoardTestSuite() {
        //Given
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BoardConfig.class);
        Board board1 = context.getBean(Board.class);
        Board board2= context.getBean(Board.class);
        Board board3 = context.getBean(Board.class);

        //When
        List toDo = board1.toDoList.addTask("To do.");
        List inProgress = board2.inProgressList.addTask("In progress.");
        List doneList = board3.doneList.addTask("Done.");
        //Then
        Assert.assertEquals("To do.", toDo);
        Assert.assertEquals("In progress.", inProgress);
        Assert.assertEquals("Done.", doneList);
    }
}
