package com.projects.todoApp.domain.tasks.services;

import org.springframework.stereotype.Service;

import com.projects.todoApp.app.tasks.ports.in.CreateTaskUserCase;
import com.projects.todoApp.app.tasks.ports.out.TaskRepositoryPort;
import com.projects.todoApp.domain.tasks.models.Task;

/**
 *
 * @author marcos-dev
 */
@Service
public class TaskService implements CreateTaskUserCase {

    private final TaskRepositoryPort taskRepository;

    public TaskService(TaskRepositoryPort taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.createTask(task);
    }

}
