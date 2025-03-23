package com.edu.unbosque.bosquecar.view;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.dto.QuotationDTO;
import com.edu.unbosque.bosquecar.model.dto.VehicleReportDTO;
import com.edu.unbosque.bosquecar.model.services.abc.IAppoinmentService;
import com.edu.unbosque.bosquecar.model.services.abc.IQuotationService;
import com.edu.unbosque.bosquecar.model.services.abc.IReportService;
import jakarta.annotation.PostConstruct;
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

    private List<VehicleReportDTO> mostRequestedVehicles;

    private List<QuotationDTO> cotizaciones;

    private List<AppoimentDTO> citas;

    @PostConstruct
    public void init() {
        mostRequestedVehicles = reportService.getMostRequestedVehicles();
        cotizaciones = quotationService.getAllQuotation();
        citas = appoinmentService.getAllAppoinment();
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
}
