package com.projects.todoapp.users.infrastructure.persistance;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.projects.todoapp.users.domain.models.User;
import com.projects.todoapp.users.domain.repositories.UserRepositoryPort;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository springDataUserRepository;

    public JpaUserRepositoryAdapter(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = new UserEntity(
            user.id(),
            user.username(),
            user.displayName()
        );

        final UserEntity savedEntity = springDataUserRepository.save(userEntity);

        return new User(
            savedEntity.getId(),
            savedEntity.getUsername(),
            savedEntity.getDisplayName()
        );
    }

    @Override
    public Optional<User> findById(String id) {
        final UserEntity userEntity = springDataUserRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
            
        return Optional.of(new User(
            userEntity.getId(),
            userEntity.getUsername(),
            userEntity.getDisplayName()
        ));
    }
}