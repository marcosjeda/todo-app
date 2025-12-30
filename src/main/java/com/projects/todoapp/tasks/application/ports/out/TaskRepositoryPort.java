package com.projects.todoapp.tasks.application.ports.out;

import java.util.Optional;

import com.projects.todoapp.tasks.domain.models.Task;

/**
 *
 * @author marcos-dev
 */
public interface TaskRepositoryPort {
    Task createTask(Task task);
    Optional<Task> getTaskById(String id);
}
