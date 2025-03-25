package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    void saveCustomer(CustomerDTO customer);
    void updateCustomer(CustomerDTO customer);
    void deleteCustomer(String id);
    CustomerDTO getCustomerById(String id);
    List<CustomerDTO> getAllCustomer();
}
