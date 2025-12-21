package com.projects.todoApp.infrastructure.auth.dto;

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

