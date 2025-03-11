package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;

public interface IVehicleMapper<T, D>{
    D toDTO(T vehicle);
    T toEntity(D dto);
}
