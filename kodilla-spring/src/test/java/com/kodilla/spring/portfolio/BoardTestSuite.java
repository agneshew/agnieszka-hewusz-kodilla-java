package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void BoardTestSuite() {
        //Given
        ApplicationContext context = new
                AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(TaskList.class);
        //When

        //Then


    }
}
