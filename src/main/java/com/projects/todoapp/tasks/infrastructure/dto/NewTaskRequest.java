package com.projects.todoapp.tasks.infrastructure.dto;

/**
 *
 * @author marcos-dev
 */
public record NewTaskRequest(
    String title,
    String description
) {}
