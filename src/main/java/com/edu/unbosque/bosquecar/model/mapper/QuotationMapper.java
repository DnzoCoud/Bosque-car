package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.QuotationDTO;
import com.edu.unbosque.bosquecar.model.entities.Quotation;

public class QuotationMapper {
    public static Quotation toEntity(QuotationDTO dto) {
        return new Quotation(dto.getId(),
                CustomerMapper.toEntity(dto.getCustomer()),
                VehicleMapper.toEntity(dto.getVehicle()),
                dto.getDate());
    }

    public static QuotationDTO toDto(Quotation quotation) {
        return new QuotationDTO(quotation.getId(),
                CustomerMapper.toDto(quotation.getCustomer()),
                VehicleMapper.toDTO(quotation.getVehicle()),
                quotation.getDate());
    }
}
