package com.edu.unbosque.bosquecar.model.converters;

import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import jakarta.persistence.AttributeConverter;

public class VehicleDisponibilityConverter  implements AttributeConverter<VehicleDisponibility, String> {
    @Override
    public String convertToDatabaseColumn(VehicleDisponibility attribute) {
        return attribute == null ? null : attribute.name().toLowerCase();
    }

    @Override
    public VehicleDisponibility convertToEntityAttribute(String dbData) {
        return dbData == null ? null : VehicleDisponibility.valueOf(dbData.toUpperCase());
    }
}
