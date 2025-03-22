package com.edu.unbosque.bosquecar.model.services.impl;

import com.edu.unbosque.bosquecar.model.dto.QuotationDTO;
import com.edu.unbosque.bosquecar.model.mapper.QuotationMapper;
import com.edu.unbosque.bosquecar.model.persistence.dao.IQuotationDAO;
import com.edu.unbosque.bosquecar.model.services.abc.IQuotationService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class QuotationService implements IQuotationService {

    @Inject
    private IQuotationDAO quotationDAO;

    @Override
    public void saveQuotation(QuotationDTO quotation) {
        quotationDAO.save(QuotationMapper.toEntity(quotation));
    }

    @Override
    public void updateQuotation(QuotationDTO quotation) {
        quotationDAO.update(quotation.getId(), QuotationMapper.toEntity(quotation));
    }

    @Override
    public void deleteQuotation(Integer id) {
        quotationDAO.delete(id);

    }

    @Override
    public QuotationDTO getQuotationById(Integer id) {
        return QuotationMapper.toDto(quotationDAO.findById(id));
    }

    @Override
    public List<QuotationDTO> getAllQuotation() {
        return quotationDAO.findAll().stream().map(QuotationMapper::toDto).collect(Collectors.toList());
    }
}
