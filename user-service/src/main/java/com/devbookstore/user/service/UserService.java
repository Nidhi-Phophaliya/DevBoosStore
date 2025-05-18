package com.devbookstore.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devbookstore.user.model.User;
import com.devbookstore.user.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
