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
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", drivingTask.executeTask());
        Assert.assertEquals("My route", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", paintingTask.executeTask());
        Assert.assertEquals("Abstract", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Task is executing", shoppingTask.executeTask());
        Assert.assertEquals("Dairy shopping", shoppingTask.getTaskName());
    }
}