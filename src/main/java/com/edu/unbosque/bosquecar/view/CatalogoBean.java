package com.edu.unbosque.bosquecar.view;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.dto.CustomerDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.services.abc.IAppoinmentService;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Named
@ViewScoped
public class CatalogoBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private IVehicleService vehicleService;

    @Inject
    private IAppoinmentService appoinmentService;

    private VehicleDTO selectedVehicle;
    private List<VehicleDTO> vehiculosDisponibles;
    private AppoimentDTO appoiment;

    @PostConstruct
    public void init(){
        vehiculosDisponibles = vehicleService.getVehiclesByAvailability(VehicleDisponibility.DISPONIBLE);
    }

    public List<VehicleDTO> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    public void prepararCita(VehicleDTO vehicle){
        this.selectedVehicle = vehicle;
        System.out.println("Selected Vehicle: " + selectedVehicle.getId());
        this.appoiment = new AppoimentDTO();
        this.appoiment.setVehicle(selectedVehicle);
        this.appoiment.setCustomer(new CustomerDTO());
        this.appoiment.setDate(LocalDate.now());
    }

    public void saveAppointment(){
        appoinmentService.saveAppoiment(appoiment);
    }

    public AppoimentDTO getAppoiment() {
        return appoiment;
    }
}
