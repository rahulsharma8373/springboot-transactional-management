package com.transaction.rest.service;

import com.transaction.rest.dto.OrderRequest;
import com.transaction.rest.dto.OrderResponse;

public interface OrderService {

	 OrderResponse placeOrder(OrderRequest orderRequest);

}
