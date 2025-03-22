package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.CustomerDTO;
import com.edu.unbosque.bosquecar.model.mapper.AppoinmentMapper;
import com.edu.unbosque.bosquecar.model.mapper.CustomerMapper;
import com.edu.unbosque.bosquecar.model.mapper.QuotationMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import com.edu.unbosque.bosquecar.model.services.abc.ICustomerService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class CustomerService implements ICustomerService {

    @Inject
    private ICustomerDAO customerDAO;

    @Override
    public void saveCustomer(CustomerDTO customer) {
        customerDAO.save(CustomerMapper.toEntity(customer));
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {

    }

    @Override
    public void deleteCustomer(Integer id) {
    customerDAO.delete(id);
    }

    @Override
    public CustomerDTO getCustomerById(Integer id) {
        return CustomerMapper.toDto(customerDAO.findById(id));
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return customerDAO.findAll().stream().map(CustomerMapper::toDto).collect(Collectors.toList());
    }
}

