package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.AppoimentDTO;

import java.util.List;

public interface IAppoinmentService {
    void saveAppoiment(AppoimentDTO appoinment);
    void updateAppoiment(AppoimentDTO appoinment);
    void deleteAppoiment(Integer id);
    AppoimentDTO getAppoimentById(Integer id);
    List<AppoimentDTO> getAllAppoinment();
}
