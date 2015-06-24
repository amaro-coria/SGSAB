package com.teknei.sitm.gsab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teknei.sitm.gsab.dao.CctmPersDAO;
import com.teknei.sitm.gsab.dao.GenericDAO;
import com.teknei.sitm.gsab.dto.CctmPersDTO;
import com.teknei.sitm.gsab.entities.CctmPers;
import com.teknei.sitm.gsab.service.CctmPersService;
import com.teknei.sitm.gsab.services.assembler.Assembler;
import com.teknei.sitm.gsab.services.assembler.CctmPersAssembler;

@Service
public class CctmPersServiceImpl extends GenericServiceImpl<CctmPersDTO, Integer, CctmPers> implements CctmPersService{

	@Autowired
	private CctmPersAssembler assembler;
	@Autowired
	private CctmPersDAO daoPers;
	
	@Override
	GenericDAO getDAO() {
		return daoPers;
	}

	@Override
	Assembler getAssembler() {
		return assembler;
	}

}
