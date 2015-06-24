package com.teknei.sitm.gsab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teknei.sitm.gsab.dao.CctmCataDAO;
import com.teknei.sitm.gsab.dao.GenericDAO;
import com.teknei.sitm.gsab.dto.CctmCataDTO;
import com.teknei.sitm.gsab.entities.CctmCata;
import com.teknei.sitm.gsab.service.CctmCataService;
import com.teknei.sitm.gsab.services.assembler.Assembler;
import com.teknei.sitm.gsab.services.assembler.CctmCataAssembler;

@Service
public class CctmCataServiceImpl extends GenericServiceImpl<CctmCataDTO, Integer, CctmCata> implements CctmCataService{

	@Autowired
	private CctmCataDAO daoCata;
	@Autowired
	private CctmCataAssembler assemblerCata;
	
	@Override
	GenericDAO getDAO() {
		return daoCata;
	}

	@Override
	Assembler getAssembler() {
		return assemblerCata;
	}

}
