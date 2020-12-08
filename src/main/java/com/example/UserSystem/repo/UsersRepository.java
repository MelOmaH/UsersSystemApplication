package com.example.UserSystem.repo;

import com.example.UserSystem.service.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUsername(String username);
}
