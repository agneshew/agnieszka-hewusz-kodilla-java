package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    //private static Logger logger;
    @Test
    public void getLastLogTest() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("my log");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("my log", lastLog);
    }
}
