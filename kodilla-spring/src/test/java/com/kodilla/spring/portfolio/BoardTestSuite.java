package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void BoardTestSuite() {
        //Given
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BoardConfig.class);
        Board board1 = (Board) context.getBean("toDoList");
        Board board2 = (Board) context.getBean("inProgress");
        Board board3 = (Board) context.getBean("doneList");

        //When
        ArrayList<String> testToDoList = new ArrayList<String>(Arrays.asList("task1"));
        ArrayList<String> testInProgressList = new ArrayList<String>(Arrays.asList("task2"));
        ArrayList<String> testDoneList = new ArrayList<String>(Arrays.asList("task3"));

        //Then
        Assert.assertEquals(board1.toDoList.tasks.size(), testToDoList.size());
        System.out.println(board1.toDoList);
        Assert.assertEquals(board2.inProgressList.tasks.size(), testInProgressList.size());
        System.out.println(board2.inProgressList);
        Assert.assertEquals(board3.doneList.tasks.size(), testDoneList.size());
        System.out.println(board3.doneList);

    }
}

