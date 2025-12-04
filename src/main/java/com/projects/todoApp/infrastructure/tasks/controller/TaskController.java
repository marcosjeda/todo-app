package com.projects.todoApp.infrastructure.tasks.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.todoApp.app.tasks.ports.in.CreateTaskUserCase;
import com.projects.todoApp.domain.tasks.models.EnumTaskStatus;
import com.projects.todoApp.domain.tasks.models.Task;
import com.projects.todoApp.infrastructure.tasks.dto.NewTaskRequest;
import com.projects.todoApp.infrastructure.tasks.dto.TaskResponse;

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
