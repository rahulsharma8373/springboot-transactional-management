package com.transaction.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.rest.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
