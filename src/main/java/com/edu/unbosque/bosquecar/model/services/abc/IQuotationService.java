package com.edu.unbosque.bosquecar.model.services.abc;
import com.edu.unbosque.bosquecar.model.dto.QuotationDTO;

import java.util.List;

public interface IQuotationService {
    void saveQuotation(QuotationDTO quotation);
    void updateQuotation(QuotationDTO quotation);
    void deleteQuotation(Integer id);
    QuotationDTO getQuotationById(Integer id);
    List<QuotationDTO> getAllQuotation();
}
