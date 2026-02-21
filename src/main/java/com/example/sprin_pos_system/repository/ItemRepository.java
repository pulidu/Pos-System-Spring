package com.example.sprin_pos_system.repository;


import com.example.sprin_pos_system.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

    Item findTopByOrderByIdDesc(); // for auto ID
}
