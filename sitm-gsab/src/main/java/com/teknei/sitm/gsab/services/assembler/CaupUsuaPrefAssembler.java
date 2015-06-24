package com.teknei.sitm.gsab.services.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.dto.CctmPersDTO;
import com.teknei.sitm.gsab.entities.CaupUsuaPref;
import com.teknei.sitm.gsab.service.CctmPersService;
import com.teknei.sitm.gsab.service.ServiceException;

@Component
public class CaupUsuaPrefAssembler extends Assembler<CaupUsuaPrefDTO, CaupUsuaPref>{

	@Autowired
	private CctmPersService servicePers;
	
	@Override
	public CaupUsuaPrefDTO getDTOTransform(CaupUsuaPref mapping) {
		if(mapping == null){
			return null;
		}
		CaupUsuaPrefDTO dto = new CaupUsuaPrefDTO();
			dto.setIdUsuaPref(mapping.getIdUsuaPref());
			dto.setMail(mapping.getCorUsua());
			try {
				CctmPersDTO pers = servicePers.findByPK(mapping.getCctmPers().getIdPers());
				dto.setPersApeMat(pers.getApeMat());
				dto.setPersApePat(pers.getApePat());
				dto.setPersCURP(pers.getCurp());
				dto.setPersFnac(pers.getFchNaci());
				dto.setPersName(pers.getNomb());
			} catch (ServiceException e) {
			}
			dto.setTel(mapping.getTelUsua());
		return dto;
	}

	@Override
	public CaupUsuaPref getMappingTransform(CaupUsuaPrefDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
