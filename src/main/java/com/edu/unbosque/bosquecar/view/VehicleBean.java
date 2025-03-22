package com.edu.unbosque.bosquecar.view;

import com.edu.unbosque.bosquecar.model.dto.CategoryDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleDTO;
import com.edu.unbosque.bosquecar.model.services.abc.ICategoryService;
import com.edu.unbosque.bosquecar.model.services.abc.IVehicleService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class VehicleBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IVehicleService vehicleService;

    @Inject
    ICategoryService categoryService;

    private List<VehicleDTO> vehicles;
    private VehicleDTO newVehicle = new VehicleDTO();
    private List<CategoryDTO> categories;

    @PostConstruct
    public void init() {
        vehicles = vehicleService.getAllVehicles();
    }


    public void openModal() {
        newVehicle = new VehicleDTO();
        categories = categoryService.getCategories();
    }


    public void saveVehicle(){
        System.out.printf("saving vehicle %s", newVehicle.getBrand());
    }


    public List<VehicleDTO> getVehicles() { return vehicles; }
    public VehicleDTO getNewVehicle() { return newVehicle; }
    public List<CategoryDTO> getCategories() {return categories;}
}
