package com.projects.todoapp.users.infrastructure.dto;

public record UserResponse(
    String id,
    String username,
    String displayName
) {
}