package com.projects.todoapp.tasks.domain.models;

public record Task(
    String id,
    String title,
    String description,
    String userId,
    EnumTaskStatus status
) {}