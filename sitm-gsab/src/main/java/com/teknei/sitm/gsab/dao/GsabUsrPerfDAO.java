/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.entities.GsabUsrPerf;

/**
 *
 * @author mbaca
 */
public interface GsabUsrPerfDAO extends GenericDAO<GsabUsrPerf, Integer>{
    public GsabUsrPerf selectByUsrName(String usrName) throws PersistenceException;
}
