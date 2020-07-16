package com.kodilla.testing.forum.statistics;
import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    //Statistics statistics;
    public int usersCount;
    public int postsCount;
    public int commentsCount;
    public double avNumberOfPostsPerUser;
    public double avNumberOfCommentsPerUser;
    public double avNumberOfCommentsPerPost;

    public void calculateAdvStatistics (Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        this.avNumberOfPostsPerUser = (double) usersCount/postsCount;
        this.avNumberOfCommentsPerUser = (double) usersCount/commentsCount;
        this.avNumberOfCommentsPerPost = (double) postsCount/commentsCount;
    }
    public void showStatistics() {
        System.out.println("Users Count:" + usersCount);
    }
}
