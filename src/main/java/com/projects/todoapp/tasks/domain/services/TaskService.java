package com.projects.todoapp.tasks.domain.services;

import org.springframework.stereotype.Service;

import com.projects.todoapp.tasks.application.ports.in.CreateTaskUserCase;
import com.projects.todoapp.tasks.application.ports.out.TaskRepositoryPort;
import com.projects.todoapp.tasks.domain.models.Task;

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
