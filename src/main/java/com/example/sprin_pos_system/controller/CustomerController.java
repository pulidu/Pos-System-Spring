package com.example.sprin_pos_system.controller;


import com.example.sprin_pos_system.dto.CustomerDTO;
import com.example.sprin_pos_system.service.CustomerService;
import com.example.sprin_pos_system.util.APIResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<APIResponse<String>> saveCustomer(
            @RequestBody @Valid CustomerDTO customerDTO) {

        customerService.saveCustomer(customerDTO);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new APIResponse<>(201, "Customer Saved", null));
    }

    @PutMapping
    public ResponseEntity<APIResponse<String>> updateCustomer(
            @RequestBody @Valid CustomerDTO customerDTO) {

        customerService.updateCustomer(customerDTO);

        return ResponseEntity.ok(
                new APIResponse<>(200, "Customer Updated", null));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<String>> deleteCustomer(
            @PathVariable String id) {

        customerService.deleteCustomer(id);

        return ResponseEntity.ok(
                new APIResponse<>(200, "Customer Deleted", null));
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
}
