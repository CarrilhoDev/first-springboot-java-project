package com.carrilho.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrilho.firstProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
