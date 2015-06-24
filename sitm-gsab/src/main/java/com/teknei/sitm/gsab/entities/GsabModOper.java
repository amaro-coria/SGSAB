package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * GsabModOper generated by hbm2java
 */
public class GsabModOper  implements java.io.Serializable {


     private int idModOper;
     private String nomModOper;
     private String desModOper;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Set<GsabPermPerf> gsabPermPerfs = new HashSet<GsabPermPerf>(0);
     private Set<GsabLogOper> gsabLogOpers = new HashSet<GsabLogOper>(0);

    public GsabModOper() {
    }

	
    public GsabModOper(int idModOper, String nomModOper, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.idModOper = idModOper;
        this.nomModOper = nomModOper;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public GsabModOper(int idModOper, String nomModOper, String desModOper, int idEsta, int idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Set<GsabPermPerf> gsabPermPerfs, Set<GsabLogOper> gsabLogOpers) {
       this.idModOper = idModOper;
       this.nomModOper = nomModOper;
       this.desModOper = desModOper;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.gsabPermPerfs = gsabPermPerfs;
       this.gsabLogOpers = gsabLogOpers;
    }
   
    public int getIdModOper() {
        return this.idModOper;
    }
    
    public void setIdModOper(int idModOper) {
        this.idModOper = idModOper;
    }
    public String getNomModOper() {
        return this.nomModOper;
    }
    
    public void setNomModOper(String nomModOper) {
        this.nomModOper = nomModOper;
    }
    public String getDesModOper() {
        return this.desModOper;
    }
    
    public void setDesModOper(String desModOper) {
        this.desModOper = desModOper;
    }
    public int getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public String getUsrCrea() {
        return this.usrCrea;
    }
    
    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }
    public Date getFchCrea() {
        return this.fchCrea;
    }
    
    public void setFchCrea(Date fchCrea) {
        this.fchCrea = fchCrea;
    }
    public String getUsrModi() {
        return this.usrModi;
    }
    
    public void setUsrModi(String usrModi) {
        this.usrModi = usrModi;
    }
    public Date getFchModi() {
        return this.fchModi;
    }
    
    public void setFchModi(Date fchModi) {
        this.fchModi = fchModi;
    }
    public Set<GsabPermPerf> getGsabPermPerfs() {
        return this.gsabPermPerfs;
    }
    
    public void setGsabPermPerfs(Set<GsabPermPerf> gsabPermPerfs) {
        this.gsabPermPerfs = gsabPermPerfs;
    }
    public Set<GsabLogOper> getGsabLogOpers() {
        return this.gsabLogOpers;
    }
    
    public void setGsabLogOpers(Set<GsabLogOper> gsabLogOpers) {
        this.gsabLogOpers = gsabLogOpers;
    }




}

