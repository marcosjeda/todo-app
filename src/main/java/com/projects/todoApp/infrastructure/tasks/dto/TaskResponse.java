package com.projects.todoApp.infrastructure.tasks.dto;

/**
 *
 * @author marcos-dev
 */
public record TaskResponse(
    String id,
    String title,
    String description,
    String status
) {}
