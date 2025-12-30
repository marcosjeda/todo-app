package com.projects.todoapp.tasks.infrastructure.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marcos-dev
 */
public interface TaskRepository extends JpaRepository<TaskEntity, String> {}
