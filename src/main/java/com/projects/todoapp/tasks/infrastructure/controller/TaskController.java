package com.projects.todoapp.tasks.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.todoapp.tasks.application.ports.in.CreateTaskUserCase;
import com.projects.todoapp.tasks.domain.models.EnumTaskStatus;
import com.projects.todoapp.tasks.domain.models.Task;
import com.projects.todoapp.tasks.infrastructure.dto.NewTaskRequest;
import com.projects.todoapp.tasks.infrastructure.dto.TaskResponse;

/**
 *
 * @author marcos-dev
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    private final CreateTaskUserCase createTaskUseCase;

    public TaskController(CreateTaskUserCase createTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
    }

    @PostMapping
    public TaskResponse createTask(@RequestBody NewTaskRequest newTask) {
        Task task = new Task(
            null,
            newTask.title(),
            newTask.description(),
            null,
            EnumTaskStatus.PENDING
        );

        Task createdTask = createTaskUseCase.createTask(task);

        return new TaskResponse(
            createdTask.id(),
            createdTask.title(),
            createdTask.description(),
            createdTask.status().name()
        );
    }
}
