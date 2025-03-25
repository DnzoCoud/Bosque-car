package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.ReportDTO;
import com.edu.unbosque.bosquecar.model.entities.Report;

public class ReportMapper {
    public static Report toEntity(ReportDTO dto) {
        return new Report(dto.getId(), dto.getVehicle(), dto.getNumberApplication(), dto.getNumberQuotation());
    }

    public static ReportDTO toDto(Report report) {
        return new ReportDTO(report.getId(), report.getVehicle(), report.getNumberApplication(), report.getNumberQuotation());
    }

}
