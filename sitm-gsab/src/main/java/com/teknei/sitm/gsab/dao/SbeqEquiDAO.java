/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.entities.SbeqEqui;

/**
 *
 * @author jamaro
 */
public interface SbeqEquiDAO extends GenericDAO<SbeqEqui, Integer>{
 
     public SbeqEqui findByNumeSeri(String numeSeri) throws PersistenceException;
     
}
