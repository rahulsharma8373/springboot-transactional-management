package com.transaction.rest.dto;

import com.transaction.rest.entity.Order;
import com.transaction.rest.entity.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
