package com.projects.todoApp.app.tasks.ports.out;

import java.util.Optional;

import com.projects.todoApp.domain.tasks.models.Task;

/**
 *
 * @author marcos-dev
 */
public interface TaskRepositoryPort {
    Task createTask(Task task);
    Optional<Task> getTaskById(String id);
}
