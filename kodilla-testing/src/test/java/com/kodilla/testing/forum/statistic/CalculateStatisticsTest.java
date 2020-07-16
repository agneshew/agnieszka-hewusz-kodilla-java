package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static java.lang.Double.NaN;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTest {
    @Test
    public void testCalculateAdvStatistics1() throws Exception {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = mock(List.class);
        when(usersNames.size()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(NaN, calculateStatistics.avNumberOfPostsPerUser, 0);
        Assert.assertEquals(NaN, calculateStatistics.avNumberOfCommentsPerPost, 0);
        Assert.assertEquals(NaN, calculateStatistics.avNumberOfCommentsPerUser, 0);
    }
    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = mock(List.class);
        when(usersNames.size()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.1, calculateStatistics.avNumberOfPostsPerUser, 0.0);
        Assert.assertEquals(10.0, calculateStatistics.avNumberOfCommentsPerPost, 0.0);
        Assert.assertEquals(1.0, calculateStatistics.avNumberOfCommentsPerUser, 0.0);
    }
    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = mock(List.class);
        when(usersNames.size()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.1, calculateStatistics.avNumberOfPostsPerUser, 0);
        Assert.assertEquals(0.5, calculateStatistics.avNumberOfCommentsPerPost, 0);
        Assert.assertEquals(0.05, calculateStatistics.avNumberOfCommentsPerUser, 0);
    }
}
