package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.entities.Appoinment;

public class AppoinmentMapper {

    public static Appoinment toEntity(AppoimentDTO dto) {
        if (dto == null) return null;

        return new Appoinment(
                dto.getId(),
                CustomerMapper.toEntity(dto.getCustomer()),
                VehicleMapper.toEntity(dto.getVehicle()),
                dto.getReason(),
                dto.getDate());
    }

    public static AppoimentDTO toDto(Appoinment appoinment) {
        return new AppoimentDTO(
                appoinment.getId(),
                CustomerMapper.toDto(appoinment.getCustomer()),
                VehicleMapper.toDTO(appoinment.getVehicle()),
                appoinment.getReason(),
                appoinment.getDate());
    }
}
