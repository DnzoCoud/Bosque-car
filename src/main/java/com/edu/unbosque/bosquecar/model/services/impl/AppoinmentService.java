package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;
import com.edu.unbosque.bosquecar.model.mapper.AppoinmentMapper;
import com.edu.unbosque.bosquecar.model.mapper.QuotationMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IAppoimentDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.ICustomerDAO;
import com.edu.unbosque.bosquecar.model.persistence.dao.IVehicleDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IAppoinmentService;
import com.edu.unbosque.bosquecar.model.services.abc.ICustomerService;
import com.edu.unbosque.bosquecar.model.services.abc.IEmailService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class AppoinmentService implements IAppoinmentService {

    @Inject
    private IAppoimentDAO appoinmentDAO;

    @Inject
    private ICustomerDAO customerDAO;

    @Inject
    private IVehicleDAO vehicleDAO;

    @Inject
    private IEmailService emailService;

    @Override
    public void saveAppoiment(AppoimentDTO appoinment) {
        try {
            appoinmentDAO.save(AppoinmentMapper.toEntity(appoinment));
            String template = emailService.loadHtmlTemplate("cita_email_template.html");
            String htmlContent = template.replace("{{name}}", appoinment.getCustomer().getName())
                    .replace("{{vehicle}}", String.format("%s - %s", appoinment.getVehicle().getBrand(), appoinment.getVehicle().getModel()))
                    .replace("{{date}}", appoinment.getDate().toString())
                    .replace("{{reason}}", appoinment.getReason());

            emailService.sendEmail(appoinment.getCustomer().getEmail(), "Agendamiento de CITA", htmlContent);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAppoiment(AppoimentDTO appoinment) {
        appoinmentDAO.update(appoinment.getId(), AppoinmentMapper.toEntity(appoinment));
    }

    @Override
    public void deleteAppoiment(Integer id) {
        appoinmentDAO.delete(id);
    }

    @Override
    public AppoimentDTO getAppoimentById(Integer id) {
        return AppoinmentMapper.toDto(appoinmentDAO.findById(id));
    }

    @Override
    public List<AppoimentDTO> getAllAppoinment() {
        return appoinmentDAO.findAll().stream().map(AppoinmentMapper::toDto).collect(Collectors.toList());
    }
}
