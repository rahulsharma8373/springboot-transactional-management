package com.transaction.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.rest.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
