package ru.alkey.learninggit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final String defaultUserName = "user";
    @GetMapping
    public String getDefaultUserName() {
        return defaultUserName;
    }
}
