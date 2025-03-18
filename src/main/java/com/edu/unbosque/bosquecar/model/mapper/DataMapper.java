package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.*;
import com.edu.unbosque.bosquecar.model.entities.*;

public class DataMapper {

    public Quotation toEntity(QuotationDTO dto) {
        return new Quotation(dto.getId(), dto.getCustomer(), dto.getVehicle(), dto.getDate());
    }

    public QuotationDTO toDto(Quotation quotation) {
        return new QuotationDTO(quotation.getId(), quotation.getCustomer(), quotation.getVehicle(), quotation.getDate());
    }

    public Report toEntity(ReportDTO dto) {
        return new Report(dto.getId(), dto.getVehicle(), dto.getNumberApplication(), dto.getNumberQuotation());
    }

    public ReportDTO toDto(Report report) {
        return new ReportDTO(report.getId(), report.getVehicle(), report.getNumberApplication(), report.getNumberQuotation());
    }

    public Customer toEntity(CustomerDTO dto) {
        return new Customer(dto.getId(), dto.getCedula(), dto.getName(), dto.getLastName(), dto.getDocument(), dto.getEmail());
    }

    public CustomerDTO toDto(Customer customer) {
        return new CustomerDTO(customer.getId(), customer.getCedula(), customer.getName(), customer.getLastName(), customer.getDocument(), customer.getEmail());
    }

    public Appoinment toEntity(AppoimentDTO dto) {
        return new Appoinment(dto.getId(), dto.getCustomer(), dto.getReason(), dto.getDate());
    }

    public AppoimentDTO toDto(Appoinment appoinment) {
        return new AppoimentDTO(appoinment.getId(), appoinment.getCustomer(), appoinment.getReason(), appoinment.getDate());
    }

    public Administrator toEntity(AdministratorDTO dto) {
        return new Administrator(dto.getId(), dto.getName(), dto.getEmail(), dto.getPassword());
    }
    public AdministratorDTO toDto(Administrator administrator) {
        return new AdministratorDTO(administrator.getId(), administrator.getName(), administrator.getEmail(), administrator.getPassword());
    }

}
