package com.example.sprin_pos_system.repository;


import com.example.sprin_pos_system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    Customer findTopByOrderByIdDesc(); // get last ID
}
