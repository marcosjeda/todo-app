package com.projects.todoapp.users.infrastructure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.todoapp.users.application.ports.in.CreateUserUseCase;
import com.projects.todoapp.users.application.ports.in.GetUserUseCase;
import com.projects.todoapp.users.domain.models.User;
import com.projects.todoapp.users.infrastructure.dto.UserRequest;
import com.projects.todoapp.users.infrastructure.dto.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetUserUseCase getUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        User userToCreate = new User(
            null,
            userRequest.username(),
            userRequest.displayName()
        );

        final User createdUser = createUserUseCase.createUser(userToCreate);

        return new UserResponse(
            createdUser.id(),
            createdUser.username(),
            createdUser.displayName()
        );
        
    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable String id) {
        User user = getUserUseCase.getUserById(id);
        return new UserResponse(
            user.id(),
            user.username(),
            user.displayName()
        );
    }
}