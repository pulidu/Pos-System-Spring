package com.example.sprin_pos_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {

    private String id;

    @NotBlank(message = "Customer name is mandatory")
    private String name;

    @NotBlank(message = "Address is mandatory")
    @Size(min = 5, message = "Address must be at least 5 characters")
    private String address;
}
