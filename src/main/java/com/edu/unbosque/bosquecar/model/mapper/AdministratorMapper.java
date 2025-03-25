package com.edu.unbosque.bosquecar.model.mapper;

import com.edu.unbosque.bosquecar.model.dto.AdministratorDTO;
import com.edu.unbosque.bosquecar.model.entities.Administrator;

public class AdministratorMapper {

    public static Administrator toEntity(AdministratorDTO dto) {
        if (dto == null) return null;
        return new Administrator(dto.getId(), dto.getName(), dto.getEmail());
    }
    public static AdministratorDTO toDto(Administrator administrator) {
        if (administrator == null) return null;
        return new AdministratorDTO(administrator.getId(), administrator.getName(), administrator.getEmail());
    }

}
