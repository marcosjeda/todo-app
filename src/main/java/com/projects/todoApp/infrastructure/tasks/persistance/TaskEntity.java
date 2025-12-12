package com.projects.todoApp.infrastructure.tasks.persistance;

import java.util.Objects;

import com.projects.todoApp.domain.tasks.models.EnumTaskStatus;
import com.projects.todoApp.infrastructure.users.persistance.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    /*@Column(name = "user_id")
    private final String userId;*/
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    public TaskEntity(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskEntity that = (TaskEntity) o;

        return Objects.equals(id, that.id) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }
}