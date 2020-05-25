package com.carrilho.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrilho.firstProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
