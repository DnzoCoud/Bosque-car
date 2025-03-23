package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.VehicleReportDTO;

import java.util.List;

public interface IReportService {
    List<VehicleReportDTO> getMostRequestedVehicles();
}
