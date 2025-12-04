package com.projects.todoApp.infrastructure.tasks.dto;

/**
 *
 * @author marcos-dev
 */
public record NewTaskRequest(
    String title,
    String description
) {}
