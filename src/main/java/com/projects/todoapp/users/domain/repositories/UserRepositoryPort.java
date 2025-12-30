package com.projects.todoapp.users.domain.repositories;

import java.util.Optional;

import com.projects.todoapp.users.domain.models.User;

public interface UserRepositoryPort {
    User saveUser(User user);
    Optional<User> findById(String id);
}