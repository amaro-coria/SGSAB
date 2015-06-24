/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknei.sitm.gsab.dto;


/**
 *
 * @author jdreyes
 */
public class LDAPConfigDTO {

    private static final long serialVersionUID = 1L;
    private String LdapHost;
    private String LdapTree;
    private String LdapObject;
    private String LdapUID;
    private Integer LdapPort;

    /**
     * @return the LdapHost
     */
    public String getLdapHost() {
        return LdapHost;
    }

    /**
     * @param LdapHost the LdapHost to set
     */
    public void setLdapHost(String LdapHost) {
        this.LdapHost = LdapHost;
    }

    /**
     * @return the LdapTree
     */
    public String getLdapTree() {
        return LdapTree;
    }

    /**
     * @param LdapTree the LdapTree to set
     */
    public void setLdapTree(String LdapTree) {
        this.LdapTree = LdapTree;
    }

    /**
     * @return the LdapObject
     */
    public String getLdapObject() {
        return LdapObject;
    }

    /**
     * @param LdapObject the LdapObject to set
     */
    public void setLdapObject(String LdapObject) {
        this.LdapObject = LdapObject;
    }

    /**
     * @return the LdapUID
     */
    public String getLdapUID() {
        return LdapUID;
    }

    /**
     * @param LdapUID the LdapUID to set
     */
    public void setLdapUID(String LdapUID) {
        this.LdapUID = LdapUID;
    }

    /**
     * @return the LdapPort
     */
    public Integer getLdapPort() {
        return LdapPort;
    }

    /**
     * @param LdapPort the LdapPort to set
     */
    public void setLdapPort(Integer LdapPort) {
        this.LdapPort = LdapPort;
    }
}
