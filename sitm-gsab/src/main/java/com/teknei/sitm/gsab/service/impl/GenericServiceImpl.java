package com.teknei.sitm.gsab.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.teknei.sitm.gsab.PersistenceException;
import com.teknei.sitm.gsab.dao.GenericDAO;
import com.teknei.sitm.gsab.service.GenericService;
import com.teknei.sitm.gsab.service.ServiceException;
import com.teknei.sitm.gsab.services.assembler.Assembler;


/**
 * Implementaci&oacute;n del Servicio
 * @version 1.0
 * @since Build 1.0
 * @author Jorge Amaro Coria
 */
public abstract class GenericServiceImpl <DTO, PK extends Serializable, Mapping> implements GenericService<DTO, PK, Mapping> {

    abstract GenericDAO getDAO();
    abstract Assembler getAssembler();
    
    private final static Logger LOGGER = LoggerFactory.getLogger(GenericServiceImpl.class);
    
    @Transactional(readOnly=true)
    public List<DTO> getAll() throws ServiceException{
        try {
            List<Mapping> listMapping = getDAO().getAll();
            return getAssembler().getDTOListTransform(listMapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional(readOnly=true)
    public DTO findByPK(PK id) throws ServiceException{
        try {
            Mapping mapping = (Mapping) getDAO().findByPK(id);
            return (DTO) getAssembler().getDTOTransform(mapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional
    public void update(DTO object) throws ServiceException{
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().update(mapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional
    public void remove(DTO object) throws ServiceException{
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().remove(mapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional
    public PK save(DTO object) throws ServiceException{
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            return (PK) getDAO().save(mapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional
    public void saveOrUpdate(DTO object) throws ServiceException{
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().saveOrUpdate(mapping);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    @Transactional(readOnly=true)
    public boolean exists(PK paramPK) throws ServiceException{
        try {
            return getDAO().exists(paramPK);
        } catch (PersistenceException ex) {
            throw new ServiceException("Hubo error en BD", ex);
        }
    }
    
      /**
     * Método para obtener la clase que persiste el DAO
     * 
     * @return <T> clase a persistir.
     */
    @SuppressWarnings("unchecked")
    private Class<DTO> getInvokingclass() {

        Class<DTO> type = null;

        Class<?> clazz = getClass();

        while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
            clazz = clazz.getSuperclass();
        }

        type = (Class<DTO>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("type BS Class :: " + type);
        }
        return type;
    }
}
