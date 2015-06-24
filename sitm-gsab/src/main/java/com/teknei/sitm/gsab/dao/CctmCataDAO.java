/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.entities.CctmCata;

import java.util.List;

/**
 *
 * @author jamaro
 */
public interface CctmCataDAO extends GenericDAO<CctmCata, Integer> {

    public CctmCata findCataActive() throws PersistenceException;

    public CctmCata findCataInactive() throws PersistenceException;

    public CctmCata findCataManual() throws PersistenceException;

    public CctmCata findCataAutomatic() throws PersistenceException;

    public List<CctmCata> findByCodCataActive(String codCata) throws PersistenceException;

    public List<CctmCata> findByCodCataAll(String codCata) throws PersistenceException;

    public List<CctmCata> findByCodCortActive(String codCort) throws PersistenceException;

    public List<CctmCata> findByCodCortAll(String codCort) throws PersistenceException;
}
