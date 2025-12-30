package com.projects.todoapp.users.infrastructure.dto;

public record UserRequest(
    String username,
    String displayName
) {
}