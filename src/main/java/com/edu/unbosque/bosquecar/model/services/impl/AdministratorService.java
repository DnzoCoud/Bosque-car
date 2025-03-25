package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.AdministratorDTO;
import com.edu.unbosque.bosquecar.model.mapper.AdministratorMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAdminDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IAdminService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class AdministratorService implements IAdminService {

    @Inject
    private IAdminDAO adminDAO;

    @Override
    public AdministratorDTO getAdmin(String email) {
        return AdministratorMapper.toDto(adminDAO.getAdmin(email));
    }
}
