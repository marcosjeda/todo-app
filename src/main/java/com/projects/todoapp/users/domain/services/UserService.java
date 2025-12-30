package com.projects.todoapp.users.domain.services;

import org.springframework.stereotype.Service;

import com.projects.todoapp.users.application.ports.in.CreateUserUseCase;
import com.projects.todoapp.users.application.ports.in.GetUserUseCase;
import com.projects.todoapp.users.domain.models.User;
import com.projects.todoapp.users.domain.repositories.UserRepositoryPort;

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