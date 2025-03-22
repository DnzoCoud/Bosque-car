package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    void saveCustomer(CustomerDTO customer);
    void updateCustomer(CustomerDTO customer);
    void deleteCustomer(Integer id);
    CustomerDTO getCustomerById(Integer id);
    List<CustomerDTO> getAllCustomer();
}
