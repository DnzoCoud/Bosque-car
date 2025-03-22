package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;

import java.util.List;

public interface IVehicleService {
    void saveVehicle(Vehicle vehicle);
    void updateVehicle(Vehicle vehicle);
    void deleteVehicle(Integer id);
    Vehicle getVehicleById(Integer id);
    List<Vehicle> getAllVehicles();
    List<Vehicle> getVehiclesByAvailability(VehicleDisponibility availability);
    List<Vehicle> getVehiclesByStatus(VehicleState status);
}
