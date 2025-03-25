package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.VehicleReportDTO;
import com.edu.unbosque.bosquecar.model.mapper.VehicleReportMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IReportDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IReportService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ReportService implements IReportService {

    @Inject
    private IReportDAO reportDAO;

    @Override
    public List<VehicleReportDTO> getMostRequestedVehicles() {
        return reportDAO.getMostRequestedVehicles()
                .stream().map(VehicleReportMapper::toDto)
                .collect(Collectors.toList());
    }
}
