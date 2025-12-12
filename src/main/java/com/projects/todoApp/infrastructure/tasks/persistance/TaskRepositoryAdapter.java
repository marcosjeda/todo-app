package com.projects.todoApp.infrastructure.tasks.persistance;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.projects.todoApp.app.tasks.ports.out.TaskRepositoryPort;
import com.projects.todoApp.domain.tasks.models.EnumTaskStatus;
import com.projects.todoApp.domain.tasks.models.Task;

/**
 *
 * @author marcos-dev
 */
@Repository
public class TaskRepositoryAdapter implements TaskRepositoryPort {

    private final TaskRepository taskRepository;

    public TaskRepositoryAdapter(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        TaskEntity taskEntity = new TaskEntity(task.title(), task.description(), task.status().name());
        TaskEntity savedTaskEntity = taskRepository.save(taskEntity);
        return new Task(savedTaskEntity.getId(), savedTaskEntity.getTitle(), savedTaskEntity.getDescription(), savedTaskEntity.getStatus(), EnumTaskStatus.valueOf(savedTaskEntity.getStatus()));
    }

    @Override
    public Optional<Task> getTaskById(String id) {

        Optional<TaskEntity> taskEntity = taskRepository.findById(id);
        return taskEntity.map(te -> new Task(te.getId(), te.getTitle(), te.getDescription(), te.getStatus(), EnumTaskStatus.valueOf(te.getStatus())));
    }

}
