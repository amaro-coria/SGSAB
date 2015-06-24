package com.teknei.sitm.gsab.service;

import java.util.List;

import com.teknei.sitm.gsab.dto.CaupUsuaPrefDTO;
import com.teknei.sitm.gsab.entities.CaupUsuaPref;

public interface CaupUsuaPrefService extends GenericService<CaupUsuaPrefDTO, Integer, CaupUsuaPref> {

	List<CaupUsuaPrefDTO> findFiltered(String name, String apePat, String apeMat)
			throws ServiceException;

}
