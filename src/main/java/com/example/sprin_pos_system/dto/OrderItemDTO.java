package com.example.sprin_pos_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderItemDTO {

    @NotBlank(message = "Item ID is required")
    private String itemId;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int qty;
}
