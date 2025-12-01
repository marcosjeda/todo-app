package com.projects.todoApp.app.users.ports.in;

import com.projects.todoApp.domain.users.models.User;

public interface CreateUserUseCase {
    User createUser(User user);
}