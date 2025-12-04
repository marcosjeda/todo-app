package com.projects.todoApp.infrastructure.tasks.persistance;

import com.projects.todoApp.domain.tasks.models.EnumTaskStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author marcos-dev
 */
@Entity
@Table(name = "tasks")
public final class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "title", nullable = false, length = 100)
    private final String title;
    @Column(name = "description", length = 300)
    private final String description;
    @Column(name = "status")
    private final String status;
    @Column(name = "user_id")
    private final String userId;

    public TaskEntity(String title, String description, String status, String userId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public String getUserId() {
        return userId;
    }
}