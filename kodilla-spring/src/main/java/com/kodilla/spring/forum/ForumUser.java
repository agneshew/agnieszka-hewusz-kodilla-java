package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;
    ForumUser() {
        username = "John Smith";
    }
}
