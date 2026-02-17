package com.example.sprin_pos_system.service;

import com.example.sprin_pos_system.dto.CustomerDTO;


import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String id);

    List<CustomerDTO> getAllCustomers();
}
