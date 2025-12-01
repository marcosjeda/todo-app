package com.projects.todoApp.domain.users.services;

import org.springframework.stereotype.Service;

import com.projects.todoApp.app.users.ports.in.CreateUserUseCase;
import com.projects.todoApp.app.users.ports.in.GetUserUseCase;
import com.projects.todoApp.app.users.ports.out.UserRepositoryPort;
import com.projects.todoApp.domain.users.models.User;

@Service
public class UserService implements CreateUserUseCase, GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        // Implementation logic to create a user
        return userRepositoryPort.saveUser(user);
    }

    @Override
    public User getUserById(String id) {
        return  userRepositoryPort.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    
}