package com.projects.todoApp.infrastructure.users.dto;

public record UserRequest(
    String username,
    String displayName
) {
}