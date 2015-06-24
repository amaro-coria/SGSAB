/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.CctmCataDAO;
import com.teknei.sitm.gsab.entities.CctmCata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jamaro
 */
@Repository
public class CctmCataDAOImpl extends GenericDAOImpl<CctmCata, Integer> implements CctmCataDAO {

    @Override
    public CctmCata findCataActive() throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.like("codCata", "CATA_ESTA"));
            criteria.add(Restrictions.like("codCort", "A"));
            CctmCata cata = (CctmCata) criteria.uniqueResult();
            return cata;
        } catch (Exception e) {
            throw new PersistenceException("Error in findCataActive:" + e.getMessage(), e);
        }
    }

    @Override
    public CctmCata findCataInactive() throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.like("codCata", "CATA_ESTA"));
            criteria.add(Restrictions.like("codCort", "I"));
            CctmCata cata = (CctmCata) criteria.uniqueResult();
            return cata;
        } catch (Exception e) {
            throw new PersistenceException("Error in findCataActive:" + e.getMessage(), e);
        }
    }

    @Override
    public CctmCata findCataManual() throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.like("codCata", "CATA_TIPO"));
            criteria.add(Restrictions.like("codCort", "M"));
            CctmCata cata = (CctmCata) criteria.uniqueResult();
            return cata;
        } catch (Exception e) {
            throw new PersistenceException("Error in findCataActive:" + e.getMessage(), e);
        }
    }

    @Override
    public CctmCata findCataAutomatic() throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.like("codCata", "CATA_TIPO"));
            criteria.add(Restrictions.like("codCort", "A"));
            CctmCata cata = (CctmCata) criteria.uniqueResult();
            return cata;
        } catch (Exception e) {
            throw new PersistenceException("Error in findCataActive:" + e.getMessage(), e);
        }
    }

    @Override
    public List<CctmCata> findByCodCataActive(String codCata) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.le("codCata", codCata));
            criteria.add(Restrictions.eq("idEcat", 1));
            List<CctmCata> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByCodCataActive:" + e.getMessage(), e);
        }
    }

    @Override
    public List<CctmCata> findByCodCataAll(String codCata) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.le("codCata", codCata));
            List<CctmCata> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByCodCataAll:" + e.getMessage(), e);
        }
    }

    @Override
    public List<CctmCata> findByCodCortActive(String codCort) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.le("codCort", codCort));
            criteria.add(Restrictions.eq("idEcat", 1));
            List<CctmCata> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByCodCortActive:" + e.getMessage(), e);
        }
    }

    @Override
    public List<CctmCata> findByCodCortAll(String codCort) throws PersistenceException {
        try {
            Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(CctmCata.class);
            criteria.add(Restrictions.le("codCort", codCort));
            criteria.add(Restrictions.eq("idEcat", 1));
            List<CctmCata> list = criteria.list();
            return list;
        } catch (Exception e) {
            throw new PersistenceException("Error in findByCodCortActive:" + e.getMessage(), e);
        }
    }
}
