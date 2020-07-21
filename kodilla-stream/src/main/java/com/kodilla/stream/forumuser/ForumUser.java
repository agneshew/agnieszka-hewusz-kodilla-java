package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char userGender;
    private final LocalDate userDateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int userId, String userName, char userGender, LocalDate userDateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userDateOfBirth = userDateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public char getUserGender() {
        return userGender;
    }
    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userDateOfBirth=" + userDateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
