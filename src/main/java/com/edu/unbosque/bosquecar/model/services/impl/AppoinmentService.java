package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.mapper.AppoinmentMapper;
import com.edu.unbosque.bosquecar.model.mapper.QuotationMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAppoimentDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IAppoinmentService;
import com.edu.unbosque.bosquecar.model.services.abc.ICustomerService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class AppoinmentService implements IAppoinmentService {

    @Inject
    private IAppoimentDAO appoinmentDAO;

    @Inject
    private ICustomerDAO customerDAO;

    @Inject
    private IVehicleDAO vehicleDAO;

    @Override
    public void saveAppoiment(AppoimentDTO appoinment) {
        appoinmentDAO.save(AppoinmentMapper.toEntity(appoinment));
    }

    @Override
    public void updateAppoiment(AppoimentDTO appoinment) {
        appoinmentDAO.update(appoinment.getId(), AppoinmentMapper.toEntity(appoinment));

    }

    @Override
    public void deleteAppoiment(Integer id) {
        appoinmentDAO.delete(id);
    }

    @Override
    public AppoimentDTO getAppoimentById(Integer id) {
        return AppoinmentMapper.toDto(appoinmentDAO.findById(id));
    }

    @Override
    public List<AppoimentDTO> getAllAppoinment() {
        return appoinmentDAO.findAll().stream().map(AppoinmentMapper::toDto).collect(Collectors.toList());
    }
}
