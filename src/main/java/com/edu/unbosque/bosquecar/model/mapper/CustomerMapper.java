package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.CustomerDTO;
import com.edu.unbosque.bosquecar.model.entities.Customer;

public class CustomerMapper {

    public static Customer toEntity(CustomerDTO dto) {
        return new Customer(dto.getCedula(), dto.getName(), dto.getLastName(), dto.getEmail());
    }

    public static CustomerDTO toDto(Customer customer) {
        return new CustomerDTO(customer.getCedula(), customer.getName(), customer.getLastName(), customer.getEmail());
    }
}
