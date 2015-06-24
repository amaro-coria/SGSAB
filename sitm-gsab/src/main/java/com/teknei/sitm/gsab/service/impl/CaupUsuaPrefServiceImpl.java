package com.teknei.sitm.gsab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.CaupUsuaPrefDAO;
import com.teknei.sitm.gsab.dao.GenericDAO;
import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.entities.CaupUsuaPref;
import com.teknei.sitm.gsab.service.CaupUsuaPrefService;
import com.teknei.sitm.gsab.service.ServiceException;
import com.teknei.sitm.gsab.services.assembler.Assembler;
import com.teknei.sitm.gsab.services.assembler.CaupUsuaPrefAssembler;

@Service
public class CaupUsuaPrefServiceImpl extends
		GenericServiceImpl<CaupUsuaPrefDTO, Integer, CaupUsuaPref> implements CaupUsuaPrefService{

	@Autowired
	private CaupUsuaPrefAssembler assembler;
	@Autowired
	private CaupUsuaPrefDAO dao;
	
	
	@Override
	public List<CaupUsuaPrefDTO> findFiltered(String name, String apePat, String apeMat) throws ServiceException{
		try{
			List<CaupUsuaPref> list = dao.findByName(name, apePat, apeMat);
			List<CaupUsuaPrefDTO> listDTO = assembler.getDTOListTransform(list);
			return listDTO;
		}catch(PersistenceException e){
			throw new ServiceException("Error in findFiltered:"+e.getMessage(),e);
		}
	}

	@Override
	GenericDAO getDAO() {
		return dao;
	}

	@Override
	Assembler getAssembler() {
		return assembler;
	}

}
