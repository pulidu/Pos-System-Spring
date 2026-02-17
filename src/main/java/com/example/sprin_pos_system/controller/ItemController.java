package com.example.sprin_pos_system.controller;



import com.example.sprin_pos_system.dto.ItemDTO;
import com.example.sprin_pos_system.service.ItemService;
import com.example.sprin_pos_system.util.APIResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<APIResponse<String>> saveItem(
            @RequestBody @Valid ItemDTO itemDTO) {

        itemService.saveItem(itemDTO);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new APIResponse<>(201, "Item Saved", null));
    }

    @PutMapping
    public ResponseEntity<APIResponse<String>> updateItem(
            @RequestBody @Valid ItemDTO itemDTO) {

        itemService.updateItem(itemDTO);

        return ResponseEntity.ok(
                new APIResponse<>(200, "Item Updated", null));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<String>> deleteItem(
            @PathVariable String id) {

        itemService.deleteItem(id);

        return ResponseEntity.ok(
                new APIResponse<>(200, "Item Deleted", null));
    }

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }
}
