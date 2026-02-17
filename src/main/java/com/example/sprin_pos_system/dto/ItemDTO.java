package com.example.sprin_pos_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDTO {

    private String id;

    @NotBlank(message = "Item name is mandatory")
    private String name;

    @Min(value = 0, message = "Quantity cannot be negative")
    private int qty;

    @Positive(message = "Price must be positive")
    private double price;
}
