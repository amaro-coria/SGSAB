package com.teknei.sitm.gsab.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.service.CaupUsuaPrefService;
import com.teknei.sitm.gsab.service.ServiceException;

@Component
public class UserPrefController {

	@Autowired
	private CaupUsuaPrefService serviceCaup;
	
	public List<CaupUsuaPrefDTO> findAll(){
		try {
			List<CaupUsuaPrefDTO> list = serviceCaup.getAll();
			return list;
		} catch (ServiceException e) {
			return new LinkedList<>();
		}
	}
	
	public List<CaupUsuaPrefDTO> findFiltered(String name, String apePat, String apeMat){
		try{
			List<CaupUsuaPrefDTO> list = serviceCaup.findFiltered(name, apePat, apeMat);
			return list;
		} catch (ServiceException e) {
			return new LinkedList<>();
		}
	}
	
}
