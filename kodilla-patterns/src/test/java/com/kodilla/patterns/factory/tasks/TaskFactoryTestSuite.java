package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task DrivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(true, DrivingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", DrivingTask.executeTask());
        Assert.assertEquals("My route", DrivingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task PaintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(true, PaintingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", PaintingTask.executeTask());
        Assert.assertEquals("Abstract", PaintingTask.getTaskName());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task ShoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(true, ShoppingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", ShoppingTask.executeTask());
        Assert.assertEquals("Dairy shopping", ShoppingTask.getTaskName());
    }
}