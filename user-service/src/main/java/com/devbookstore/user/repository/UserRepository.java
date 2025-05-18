package com.devbookstore.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbookstore.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
