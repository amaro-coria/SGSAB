/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao;

import com.teknei.sitm.gsab.dto.LDAPConfigDTO;

import java.util.List;


/**
 *
 * @author jdreyes
 */
public interface UserAccessDAO {
    
    /**
     * Checks if the given username is valid on the system
     *
     * @param username
     * @param config
     * @return
     */
    boolean isValidUsername(String username, LDAPConfigDTO config);

    /**
     * Returns the list of users of the system
     *
     * @param config the configuration for LDAP
     * @return
     */
    List<String> findSystemUsers(LDAPConfigDTO config);

    boolean authenticate(String username, String password, LDAPConfigDTO config);
    
}
