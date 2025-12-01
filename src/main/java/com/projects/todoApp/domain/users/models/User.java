package com.projects.todoApp.domain.users.models;

public record User(
    String id,
    String username,
    String displayName
) {
}