/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.dao.GsabSmodOperDAO;
import com.teknei.sitm.gsab.entities.GsabSmodOper;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mbaca
 */
@Repository
@Transactional
public class GsabSmodOperDAOImpl extends GenericDAOImpl<GsabSmodOper, Integer> implements GsabSmodOperDAO{
    
}
