/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.GsabUsrPerfDAO;
import com.teknei.sitm.gsab.entities.GsabUsrPerf;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mbaca
 */
@Repository
public class GsabUsrPrefDAOImpl extends GenericDAOImpl<GsabUsrPerf, Integer> implements GsabUsrPerfDAO{
    
    @Transactional
    public GsabUsrPerf selectByUsrName(String usrName) throws PersistenceException{
        try{
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(GsabUsrPerf.class);
            criteria.add(Restrictions.like("usrName", usrName));
            GsabUsrPerf usrPerfEntity = new GsabUsrPerf();
            usrPerfEntity = (GsabUsrPerf) criteria.uniqueResult();
            return usrPerfEntity;
        }catch(Exception e){
            throw new PersistenceException("Error in selectByUsrName:"+e.getMessage(), e);
        }
    }   
}
