package com.projects.todoapp.users.application.ports.in;

import com.projects.todoapp.users.domain.models.User;

public interface CreateUserUseCase {
    User createUser(User user);
}