/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.entities.CaupUsuaPref;

import java.util.List;

/**
 *
 * @author jamaro
 */
public interface CaupUsuaPrefDAO extends GenericDAO<CaupUsuaPref, Integer> {

    public List<CaupUsuaPref> findByName(String name, String apePat, String apeMat) throws PersistenceException;
}
