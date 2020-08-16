package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
//        Board board2= (Board) context.getBean("inProgress");
        Board board3 = (Board) context.getBean("doneList");

        //Then
        System.out.println(board1);
//
////        List <String> toDoList = board1.toDoList.addTask("To do");
//        List <String> inProgress = board2.inProgressList.addTask("In progress");
//        List <String> doneList = board3.doneList.addTask("Done");

        //Then
       // System.out.println(board1);
//        System.out.println(inProgress);
//        System.out.println(doneList);
//        Assert.assertEquals("To do", toDoList);
//        Assert.assertEquals("In progress", inProgress);
//        Assert.assertEquals("Done", doneList);


        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}

