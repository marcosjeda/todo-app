package com.projects.todoApp.infrastructure.tasks.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marcos-dev
 */
public interface TaskRepository extends JpaRepository<TaskEntity, String> {}
