/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.entities.CctmEmp;

import java.util.List;

/**
 *
 * @author jamaro
 */
public interface CctmEmpDAO extends GenericDAO<CctmEmp, Integer> {

    public List<CctmEmp> findByName(String name, String apePat, String apeMat) throws PersistenceException;
}
