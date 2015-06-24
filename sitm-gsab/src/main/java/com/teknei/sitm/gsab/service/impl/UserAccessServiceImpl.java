package com.teknei.sitm.gsab.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teknei.sitm.gsab.dao.UserAccessDAO;
import com.teknei.sitm.gsab.dto.LDAPConfigDTO;
import com.teknei.sitm.gsab.service.UserAccessServicce;

@Service
public class UserAccessServiceImpl implements UserAccessServicce {

	@Autowired
	private UserAccessDAO daoAccess;

	@Override
	public boolean access(String username, String password) {
		LDAPConfigDTO config = new LDAPConfigDTO();
		Properties prop = new Properties();
		InputStream input = null;
		input = this.getClass().getClassLoader()
				.getResourceAsStream("propertiesLDAP.properties");
		try {
			prop.load(input);
			config.setLdapHost(prop.getProperty("host"));
            config.setLdapObject(prop.getProperty("object"));
            config.setLdapUID(prop.getProperty("uid"));
            Integer portConfig = Integer.parseInt(prop.getProperty("port"));
            config.setLdapPort(portConfig);
            config.setLdapTree(prop.getProperty("ldapTree"));
            boolean b = daoAccess.authenticate(username, password, config);
            return b;
		} catch (IOException e) {
			return false;
		}
	}
}
