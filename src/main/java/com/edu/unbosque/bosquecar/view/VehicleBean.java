package com.edu.unbosque.bosquecar.view;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.entities.VehicleDisponibility;
import com.edu.unbosque.bosquecar.model.entities.VehicleState;
import com.edu.unbosque.bosquecar.model.services.abc.ICategoryService;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import org.primefaces.model.file.UploadedFile;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class VehicleBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IVehicleService vehicleService;

    @Inject
    private ICategoryService categoryService;

    private List<VehicleDTO> vehicles;
    private VehicleDTO newVehicle = new VehicleDTO();
    private List<CategoryDTO> categories;
    private List<VehicleDTO> filteredVehicles;
    private String selectedState;
    private String selectedAvailability;

    @PostConstruct
    public void init() {
        vehicles = vehicleService.getAllVehicles();
        filteredVehicles = new ArrayList<>(vehicles);
    }
    public void filterVehicles() {
        filteredVehicles = vehicles.stream()
                .filter(v -> (selectedState == null || selectedState.isEmpty() || v.getStatus().equals(selectedState)))
                .filter(v -> (selectedAvailability == null || selectedAvailability.isEmpty() || v.getAvailability().equals(selectedAvailability)))
                .collect(Collectors.toList());
    }



    public void openModal() {
        newVehicle = new VehicleDTO();
        categories = categoryService.getCategories();
    }

    public String getCategoryName(int categoryId) {
        CategoryDTO category = categoryService.getCategory(categoryId);
        return category.getName();
    }
    public void saveVehicle(){
            if (newVehicle.getAvailability() == null) {
                newVehicle.setAvailability(VehicleDisponibility.DISPONIBLE.name().toUpperCase());
            }
            if (newVehicle.getStatus() == null) {
                newVehicle.setStatus(VehicleState.NUEVO.name().toUpperCase());
            }
            vehicleService.saveVehicle(newVehicle);
            newVehicle = new VehicleDTO();
            filteredVehicles = vehicleService.getAllVehicles();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Vehículo registrado", ""));

    }

    public void updateVehicle(){
        vehicleService.updateVehicle(newVehicle);
        newVehicle = new VehicleDTO();
        filteredVehicles = vehicleService.getAllVehicles();
    }

    public List<String> getVehicleStates() {
        return Arrays.stream(VehicleState.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public List<String> getVehicleAvailability() {
        return Arrays.stream(VehicleDisponibility.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public boolean isCargoVehicle() {
        return newVehicle.getCategoryId() != null && newVehicle.getCategoryId() == 1;
    }

    public boolean isFamilyVehicle() {
        return newVehicle.getCategoryId() != null && newVehicle.getCategoryId() == 2;
    }

    public boolean isUtilityVehicle() {
        return newVehicle.getCategoryId() != null && newVehicle.getCategoryId() == 3;
    }

    public void prepareForUpdate(Integer id_vehicle) {
        newVehicle = vehicleService.getVehicleById(id_vehicle);
        categories = categoryService.getCategories();
    }

    public List<VehicleDTO> getVehicles() { return vehicles; }
    public VehicleDTO getNewVehicle() { return newVehicle; }
    public List<CategoryDTO> getCategories() {return categories;}

    public String getSelectedState() {
        return selectedState;
    }

    public void setSelectedState(String selectedState) {
        this.selectedState = selectedState;
    }

    public String getSelectedAvailability() {
        return selectedAvailability;
    }

    public void setSelectedAvailability(String selectedAvailability) {
        this.selectedAvailability = selectedAvailability;
    }

    public List<VehicleDTO> getFilteredVehicles() {
        return filteredVehicles;
    }
}
