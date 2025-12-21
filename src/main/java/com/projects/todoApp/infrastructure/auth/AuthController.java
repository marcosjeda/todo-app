package com.projects.todoApp.infrastructure.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 *
 * @author marcos
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @RequestMapping("/register")
    public String register() {
        return "Register endpoint";
    }
}
