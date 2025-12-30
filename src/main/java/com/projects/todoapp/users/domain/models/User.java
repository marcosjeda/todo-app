package com.projects.todoapp.users.domain.models;

public record User(
    String id,
    String username,
    String displayName
) {
}