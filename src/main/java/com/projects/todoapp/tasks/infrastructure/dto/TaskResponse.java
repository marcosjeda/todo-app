package com.projects.todoapp.tasks.infrastructure.dto;

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
