package com.teknei.sitm.gsab.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceException extends Exception {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        private static Logger LOGGER = LoggerFactory.getLogger(ServiceException.class);
        
        public ServiceException() {
                LOGGER.error("Error en Servicio sin descripcion");
        }

        public ServiceException(String message) {
                super(message);
                LOGGER.error("Error en Servicio::"+message);
        }

        public ServiceException(Throwable cause) {
                super(cause);
                LOGGER.error("Error en servicio solo con causa::"+cause.getMessage(), cause);
        }

        public ServiceException(String message, Throwable cause) {
                super(message, cause);
                LOGGER.error("Error en Servicio::"+message, cause);
        }



}
