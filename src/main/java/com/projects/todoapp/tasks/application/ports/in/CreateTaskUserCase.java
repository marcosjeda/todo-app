package com.projects.todoapp.tasks.application.ports.in;

import com.projects.todoapp.tasks.domain.models.Task;

/**
 *
 * @author marcos-dev
 */
public interface CreateTaskUserCase {
    Task createTask(Task task);
}
