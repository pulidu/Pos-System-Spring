package com.example.sprin_pos_system.repository;


import com.example.sprin_pos_system.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    Order findTopByOrderByIdDesc(); // for auto ID
}

