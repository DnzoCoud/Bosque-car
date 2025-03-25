package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.Vehicle;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import jakarta.servlet.http.Part;
import org.primefaces.model.file.UploadedFile;

import java.util.List;

public interface IVehicleService {
    void saveVehicle(VehicleDTO vehicle);
    void updateVehicle(VehicleDTO vehicle);
    void deleteVehicle(Integer id);
    VehicleDTO getVehicleById(Integer id);
    List<VehicleDTO> getAllVehicles();
    List<VehicleDTO> getVehiclesByAvailability(VehicleDisponibility availability);
    List<VehicleDTO> getVehiclesByStatus(VehicleState status);
}
