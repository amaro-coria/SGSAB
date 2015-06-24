/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.CctmEmpDAO;
import com.teknei.sitm.gsab.entities.CctmEmp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jamaro
 */
@Repository
public class CctmEmpDAOImpl extends GenericDAOImpl<CctmEmp, Integer> implements CctmEmpDAO {

    @Override
    public List<CctmEmp> findByName(String name, String apePat, String apeMat) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmEmp.class);
            criteria.add(Restrictions.eq("cctmCataByIdEsta.idCata", 1));
            criteria = criteria.createCriteria("cctmPers");
            if (name != null) {
                criteria.add(Restrictions.like("nomb", name));
            }
            if (apePat != null) {
                criteria.add(Restrictions.like("apePat", name));
            }
            if (apeMat != null) {
                criteria.add(Restrictions.like("apeMat", name));
            }
            List<CctmEmp> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByName:" + e.getMessage(), e);
        }
    }

}
