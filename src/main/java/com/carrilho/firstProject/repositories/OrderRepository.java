package com.carrilho.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrilho.firstProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
