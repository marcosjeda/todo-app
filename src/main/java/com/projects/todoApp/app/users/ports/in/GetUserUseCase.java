package com.projects.todoApp.app.users.ports.in;

import com.projects.todoApp.domain.users.models.User;

public interface GetUserUseCase {
    User getUserById(String id);
}