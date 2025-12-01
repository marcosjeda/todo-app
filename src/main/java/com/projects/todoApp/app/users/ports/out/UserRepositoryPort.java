package com.projects.todoApp.app.users.ports.out;

import java.util.Optional;

import com.projects.todoApp.domain.users.models.User;

public interface UserRepositoryPort {
    User saveUser(User user);
    Optional<User> findById(String id);
}