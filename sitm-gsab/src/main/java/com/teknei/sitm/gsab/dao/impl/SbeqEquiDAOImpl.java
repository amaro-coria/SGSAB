/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.SbeqEquiDAO;
import com.teknei.sitm.gsab.entities.SbeqEqui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

/**
 *
 * @author jamaro
 */
@Repository
@Transactional
public class SbeqEquiDAOImpl extends GenericDAOImpl<SbeqEqui, Integer> implements SbeqEquiDAO {
    
    @Override    
    public SbeqEqui findByNumeSeri(String numeSeri) throws PersistenceException{
        try{
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(SbeqEqui.class);
            criteria.add(Restrictions.like("numeSeri", numeSeri));
            List<SbeqEqui> list = criteria.list();
            if(CollectionUtils.isEmpty(list)){
                return null;
            }
            SbeqEqui equi = list.get(0);
            return equi;
        }catch(Exception e){
            throw new PersistenceException("Error in findByNumeSeri:"+e.getMessage(), e);
        }
    }
    
}
