package com.projects.todoApp.infrastructure.users.persistance;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.projects.todoApp.infrastructure.tasks.persistance.TaskEntity;

import jakarta.persistence.OneToMany;

@Entity
@Table(name = "users")
public final class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, length = 50)
    private String id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "display_name", nullable = false, length = 100)
    private String displayName;

    @OneToMany(mappedBy = "user")
    private List<TaskEntity> tasks;

    public UserEntity() {}

    public UserEntity(String id, String username, String displayName) {
        this.id = id;
        this.username = username;
        this.displayName = displayName;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}