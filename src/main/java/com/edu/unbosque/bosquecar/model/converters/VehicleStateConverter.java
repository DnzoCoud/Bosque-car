package com.edu.unbosque.bosquecar.model.converters;

import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import jakarta.persistence.AttributeConverter;

public class VehicleStateConverter implements AttributeConverter<VehicleState, String> {
    @Override
    public String convertToDatabaseColumn(VehicleState attribute) {
        return attribute == null ? null : attribute.name().toLowerCase();
    }

    @Override
    public VehicleState convertToEntityAttribute(String dbData) {
        return dbData == null ? null : VehicleState.valueOf(dbData.toUpperCase());
    }
}
