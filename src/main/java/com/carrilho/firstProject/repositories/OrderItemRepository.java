package com.carrilho.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrilho.firstProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
