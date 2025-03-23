package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.VehicleReportDTO;
import com.edu.unbosque.bosquecar.model.entities.VehicleReport;

public class VehicleReportMapper {

    public static VehicleReport toEntity(VehicleReportDTO vehicleReport) {
        return new VehicleReport(
                vehicleReport.getId(),
                vehicleReport.getBrand(),
                vehicleReport.getModel(),
                vehicleReport.getTotalCount()
        );
    }

    public static VehicleReportDTO toDto(VehicleReport vehicleReport) {
        return new VehicleReportDTO(
                vehicleReport.getId(),
                vehicleReport.getBrand(),
                vehicleReport.getModel(),
                vehicleReport.getTotalCount()
        );
    }
}
