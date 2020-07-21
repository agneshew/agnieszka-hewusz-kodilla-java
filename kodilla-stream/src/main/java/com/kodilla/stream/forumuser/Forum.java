package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "john", 'M', LocalDate.of(1990, 12,12), 23));
        userList.add(new ForumUser(2, "Ann", 'F', LocalDate.of(2003, 2, 23), 45));
        userList.add(new ForumUser(3, "Alice", 'F', LocalDate.of(1999, 8,9), 3));
        userList.add(new ForumUser(0, "jack", 'M', LocalDate.of(2015,5,30), 2));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
