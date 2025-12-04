package com.projects.todoApp.domain.tasks.models;

public record Task(
    String id,
    String title,
    String description,
    String userId,
    EnumTaskStatus status
) {}