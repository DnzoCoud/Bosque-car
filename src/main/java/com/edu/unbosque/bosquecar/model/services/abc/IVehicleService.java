package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<VehicleDTO> findAllVehicles();
    void saveVehicle(VehicleDTO vehicle);
    VehicleDTO findVehicleById(int id);
    void deleteVehicle(int id);
}
