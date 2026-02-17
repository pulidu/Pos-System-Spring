package com.example.sprin_pos_system.service;

import com.example.sprin_pos_system.dto.OrderDTO;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {

    @Transactional
    void placeOrder(OrderDTO orderDTO);

    List<OrderDTO> getOrderHistory();
}
