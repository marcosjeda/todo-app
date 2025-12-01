package com.projects.todoApp.infrastructure.users.dto;

public record UserResponse(
    String id,
    String username,
    String displayName
) {
}