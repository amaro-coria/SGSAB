/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.CaupUsuaPrefDAO;
import com.teknei.sitm.gsab.entities.CaupUsuaPref;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/** 
 *
 * @author jamaro
 */ 
@Repository
public class CaupUsuaPrefDAOImpl extends GenericDAOImpl<CaupUsuaPref, Integer> implements CaupUsuaPrefDAO{
    
    
    @Override
    public List<CaupUsuaPref> findByName(String name, String apePat, String apeMat) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CaupUsuaPref.class);
            criteria.add(Restrictions.eq("cctmCataByIdEsta.idCata", 1));
            criteria = criteria.createCriteria("cctmPers");
            if (name != null && !name.isEmpty()) {
                criteria.add(Restrictions.ilike("nomb", name, MatchMode.ANYWHERE));
            }
            if (apePat != null && !apePat.isEmpty()) {
                criteria.add(Restrictions.ilike("apePat", name,  MatchMode.ANYWHERE));
            }
            if (apeMat != null && !apeMat.isEmpty()) {
                criteria.add(Restrictions.ilike("apeMat", name,  MatchMode.ANYWHERE));
            }
            List<CaupUsuaPref> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByName:" + e.getMessage(), e);
        }
    }
}
