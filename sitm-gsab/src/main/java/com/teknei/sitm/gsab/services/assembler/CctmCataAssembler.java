package com.teknei.sitm.gsab.services.assembler;

import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.dto.CctmCataDTO;
import com.teknei.sitm.gsab.entities.CctmCata;

@Component
public class CctmCataAssembler extends Assembler<CctmCataDTO, CctmCata>{

	@Override
	public CctmCataDTO getDTOTransform(CctmCata mapping) {
		if(mapping == null){
			return null;
		}
		CctmCataDTO dto = new CctmCataDTO();
		dto.setCodCata(mapping.getCodCata());
		dto.setCodComp(mapping.getCodComp());
		dto.setCodCort(mapping.getCodCort());
		dto.setDesComp(mapping.getDesComp());
		dto.setDesCort(mapping.getDesCort());
		dto.setIdCata(mapping.getIdCata());
		dto.setIdEcat(mapping.getIdEcat());
		dto.setIdIdio(mapping.getIdIdio());
		dto.setIdTcat(mapping.getIdTcat());
		dto.setOrdeCata(mapping.getOrdeCata());
		return dto;
	}

	@Override
	public CctmCata getMappingTransform(CctmCataDTO dto) {
		if(dto == null){
			return null;
		}
		CctmCata mapping = new CctmCata();
		mapping.setCodCata(dto.getCodCata());
		mapping.setCodComp(dto.getCodComp());
		mapping.setCodCort(dto.getCodCort());
		mapping.setDesComp(dto.getDesComp());
		mapping.setDesCort(dto.getDesCort());
		mapping.setIdCata(dto.getIdCata());
		mapping.setIdEcat(dto.getIdEcat());
		mapping.setIdIdio(dto.getIdIdio());
		mapping.setIdTcat(dto.getIdTcat());
		mapping.setOrdeCata(dto.getOrdeCata());
		return mapping;
	}

}
