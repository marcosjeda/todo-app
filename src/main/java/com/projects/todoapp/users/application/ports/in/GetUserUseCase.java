package com.projects.todoapp.users.application.ports.in;

import com.projects.todoapp.users.domain.models.User;

public interface GetUserUseCase {
    User getUserById(String id);
}