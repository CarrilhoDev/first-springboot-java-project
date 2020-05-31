package com.carrilho.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrilho.firstProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
