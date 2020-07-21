package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserGender() == 'M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

            theResultOfUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + "; " + entry.getValue())
                    .forEach(System.out::println);
    }
}