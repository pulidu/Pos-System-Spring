package com.example.sprin_pos_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private String id; // auto generated

    @NotBlank(message = "Customer is required")
    private String customerId;

    @NotBlank(message = "Order date is required")
    private String date;

    private Double total;

    @NotEmpty(message = "At least one item is required")
    private List<OrderItemDTO> items;
}
