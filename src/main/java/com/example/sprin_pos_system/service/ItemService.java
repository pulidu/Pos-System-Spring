package com.example.sprin_pos_system.service;

import com.example.sprin_pos_system.dto.ItemDTO;


import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);

    void deleteItem(String id);
    List<ItemDTO> getAllItems();

    // New methods
    ItemDTO getItemById(String id);
    void reduceStock(String itemId, int qty);
}
