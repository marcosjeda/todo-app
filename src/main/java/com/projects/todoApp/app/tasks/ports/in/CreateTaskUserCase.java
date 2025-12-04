package com.projects.todoApp.app.tasks.ports.in;

import com.projects.todoApp.domain.tasks.models.Task;

/**
 *
 * @author marcos-dev
 */
public interface CreateTaskUserCase {
    Task createTask(Task task);
}
