/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dao.impl;

import com.teknei.sitm.gsab.dao.UserAccessDAO;
import com.teknei.sitm.gsab.dto.LDAPConfigDTO;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.directory.api.ldap.model.cursor.CursorException;
import org.apache.directory.api.ldap.model.cursor.EntryCursor;
import org.apache.directory.api.ldap.model.entry.Attribute;
import org.apache.directory.api.ldap.model.entry.Entry;
import org.apache.directory.api.ldap.model.entry.Value;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.message.SearchScope;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jdreyes
 */
@Repository
public class UserAccessDAOImpl implements UserAccessDAO{

    @Override
    public boolean authenticate(String username, String password,
			LDAPConfigDTO config) {
		LdapConnection connection = null;
		boolean b = false;
		try {
			connection = new LdapNetworkConnection(config.getLdapHost(),
					config.getLdapPort());
			connection.bind(config.getLdapUID() + "=" + username + ","
					+ config.getLdapTree() , password);
			b = connection.isAuthenticated();
		} catch (LdapException e) {
		} finally {
			IOUtils.closeQuietly(connection);
		}
		return b;
	}
    
    @SuppressWarnings("rawtypes")
    @Override
    public boolean isValidUsername(String username, LDAPConfigDTO config) {
        LdapConnection connection = null;
        try {
            connection = new LdapNetworkConnection(config.getLdapHost(),
					config.getLdapPort());
            connection.bind();
            EntryCursor cursor = connection.search(config.getLdapTree(), config.getLdapObject(), SearchScope.ONELEVEL, "*");
            while (cursor.next()) {                
                Entry entry = cursor.get();
                Attribute attre = entry.get(config.getLdapUID());
                Value value = attre.get();
                if(value.getString().equals(username)){
                    return true;
                }
            }
        }catch (LdapException | CursorException e) {
        }finally{
            IOUtils.closeQuietly(connection);
        }
        return false;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<String> findSystemUsers(LDAPConfigDTO config) {
        List<String> listUsers = new LinkedList<String>();
        LdapConnection connection = null;
        try {
            
            connection = new LdapNetworkConnection(config.getLdapHost(),
					config.getLdapPort());
            connection.bind();
            EntryCursor cursor = connection.search(config.getLdapTree(), config.getLdapObject(), SearchScope.ONELEVEL, "*");
            while (cursor.next()) {
                org.apache.directory.api.ldap.model.entry.Entry entry = cursor.get();
                Attribute attre = entry.get(config.getLdapUID());
                Value val = attre.get();
                String username = val.getString();
                listUsers.add(username);
            }
            connection.unBind();
        } catch (LdapException | CursorException e) {
        }finally{
            IOUtils.closeQuietly(connection);
        }
        return  listUsers;
    }
    
}
