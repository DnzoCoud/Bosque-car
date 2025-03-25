package com.edu.unbosque.bosquecar.view;

import com.edu.unbosque.bosquecar.model.dto.AdministratorDTO;
import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.dto.QuotationDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleReportDTO;
import com.edu.unbosque.bosquecar.model.services.abc.IAdminService;
import com.edu.unbosque.bosquecar.model.services.abc.IAppoinmentService;
import com.edu.unbosque.bosquecar.model.services.abc.IQuotationService;
import com.edu.unbosque.bosquecar.model.services.abc.IReportService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class AdminBean implements Serializable {

    @Inject
    private IReportService reportService;

    @Inject
    private IQuotationService quotationService;

    @Inject
    private IAppoinmentService appoinmentService;

    @Inject
    private IAdminService adminService;

    private List<VehicleReportDTO> mostRequestedVehicles;

    private List<QuotationDTO> cotizaciones;

    private List<AppoimentDTO> citas;

    private String emailAuth;

    @PostConstruct
    public void init() {
        mostRequestedVehicles = reportService.getMostRequestedVehicles();
        cotizaciones = quotationService.getAllQuotation();
        citas = appoinmentService.getAllAppoinment();
    }

    public String authAdmin(){
        try {
            AdministratorDTO admin = adminService.getAdmin(emailAuth);
            if (admin != null) {
                return "admin?faces-redirect=true";
            } else {
                throw new Exception("Administrador no encontrado");
            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Credenciales incorrectas"));
            return null; // Permanece en la página de login
        }
    }

    public List<VehicleReportDTO> getMostRequestedVehicles() {
        return mostRequestedVehicles;
    }

    public List<QuotationDTO> getCotizaciones() {
        return cotizaciones;
    }

    public List<AppoimentDTO> getCitas() {
        return citas;
    }

    public String getEmailAuth() {
        return emailAuth;
    }
    public void setEmailAuth(String emailAuth) {
        this.emailAuth = emailAuth;
    }
}
