package com.projects.todoapp.auth.infrastructure.dto;

/**
 *
 * @author marcos-dev
 */

public record RegisterUser(
    String username,
    String password,
    String displayName
) {
}

