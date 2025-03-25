package com.edu.unbosque.bosquecar.model.services.abc;

import com.edu.unbosque.bosquecar.model.dto.AdministratorDTO;

public interface IAdminService {
    AdministratorDTO getAdmin(String email);
}
