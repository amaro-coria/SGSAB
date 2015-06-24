package com.teknei.sitm.gsab.services.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.dto.CctmCataDTO;
import com.teknei.sitm.gsab.dto.CctmPersDTO;
import com.teknei.sitm.gsab.entities.CctmPers;
import com.teknei.sitm.gsab.service.CctmCataService;
import com.teknei.sitm.gsab.service.ServiceException;

@Component
public class CctmPersAssembler extends Assembler<CctmPersDTO, CctmPers> {

	@Autowired
	private CctmCataService serviceCata;

	private String findCataDsc(Integer idCata) {
		try {
			CctmCataDTO dto = serviceCata.findByPK(idCata);
			String dsc = dto.getDesCort();
			return dsc;
		} catch (ServiceException e) {
			return "";
		}
	}

	@Override
	public CctmPersDTO getDTOTransform(CctmPers mapping) {
		if (mapping == null) {
			return null;
		}
		CctmPersDTO dto = new CctmPersDTO();
		dto.setApeMat(mapping.getApeMat());
		dto.setApePat(mapping.getApePat());
		dto.setCurp(mapping.getCurp());
		dto.setFchAlta(mapping.getFchAlta());
		dto.setFchNaci(mapping.getFchNaci());
		if (mapping.getCctmCataByIdEciv() != null) {
			dto.setIdEciv(mapping.getCctmCataByIdEciv().getIdCata());
			dto.setIdEcivDsc(findCataDsc(mapping.getCctmCataByIdEciv()
					.getIdCata()));
		}
		if (mapping.getCctmCataByIdEper() != null) {
			dto.setIdEper(mapping.getCctmCataByIdEper().getIdCata());
			dto.setIdEperDsc(findCataDsc(mapping.getCctmCataByIdEper()
					.getIdCata()));
		}
		dto.setIdEsta(mapping.getCctmCataByIdEsta().getIdCata());
		dto.setIdEstaDsc(findCataDsc(mapping.getCctmCataByIdEsta().getIdCata()));
		if (mapping.getCctmCataByIdPaes() != null) {
			dto.setIdPaes(mapping.getCctmCataByIdPaes().getIdCata());
			dto.setIdPaesDsc(findCataDsc(mapping.getCctmCataByIdPaes()
					.getIdCata()));
		}
		if (mapping.getCctmCataByIdPais() != null) {
			dto.setIdPais(mapping.getCctmCataByIdPais().getIdCata());
			dto.setIdPaisDsc(findCataDsc(mapping.getCctmCataByIdPais()
					.getIdCata()));
		}
		dto.setIdPers(mapping.getIdPers());
		dto.setIdSexo(mapping.getCctmCataByIdSexo().getIdCata());
		dto.setIdSexoDsc(findCataDsc(mapping.getCctmCataByIdSexo().getIdCata()));
		dto.setIdTipo(mapping.getCctmCataByIdTipo().getIdCata());
		dto.setIdTipoDsc(findCataDsc(mapping.getCctmCataByIdTipo().getIdCata()));
		if (mapping.getCctmCataByIdTper() != null) {
		}
		dto.setRfc(mapping.getRfc());
		dto.setNomb(mapping.getNomb());
		return dto;
	}

	@Override
	public CctmPers getMappingTransform(CctmPersDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
