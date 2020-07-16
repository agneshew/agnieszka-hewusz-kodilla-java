package com.kodilla.testing.forum.statistics;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.isNaN;

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

        if (isNaN(usersCount/postsCount)) {
            avNumberOfPostsPerUser= 0;
        }
        if (isNaN(usersCount/commentsCount)) {
            avNumberOfCommentsPerUser= 0;
        }
        if (isNaN(postsCount/commentsCount)) {
            avNumberOfCommentsPerPost= 0;
        }
    }
    public void showStatistics() {
        System.out.println("Users Count:" + usersCount);
    }
}
