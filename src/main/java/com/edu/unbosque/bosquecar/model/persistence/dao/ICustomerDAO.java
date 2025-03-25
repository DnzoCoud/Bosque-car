package com.edu.unbosque.bosquecar.model.persistence.dao;

import com.edu.unbosque.bosquecar.model.entities.Customer;

public interface ICustomerDAO extends IGenericsDAO<Customer, String>{
    Customer findByEmail(String email);
    Customer saveAndReturn(Customer entity);
}
