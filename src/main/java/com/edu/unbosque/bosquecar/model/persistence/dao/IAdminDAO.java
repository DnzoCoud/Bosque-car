package com.edu.unbosque.bosquecar.model.persistence.dao;

import com.edu.unbosque.bosquecar.model.entities.Administrator;

public interface IAdminDAO {
    Administrator getAdmin(String email);
}
