package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CctmCodp generated by hbm2java
 */
public class CctmCodp  implements java.io.Serializable {


     private CctmCodpId id;
     private CctmCata cctmCataByIdTipo;
     private CctmCata cctmCataByIdEsta;
     private String nomCodp;
     private String usrCrea;
     private Date fchCrea;
     private Set<CctmDire> cctmDires = new HashSet<CctmDire>(0);

    public CctmCodp() {
    }

	
    public CctmCodp(CctmCodpId id, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, String usrCrea, Date fchCrea) {
        this.id = id;
        this.cctmCataByIdTipo = cctmCataByIdTipo;
        this.cctmCataByIdEsta = cctmCataByIdEsta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CctmCodp(CctmCodpId id, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, String nomCodp, String usrCrea, Date fchCrea, Set<CctmDire> cctmDires) {
       this.id = id;
       this.cctmCataByIdTipo = cctmCataByIdTipo;
       this.cctmCataByIdEsta = cctmCataByIdEsta;
       this.nomCodp = nomCodp;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.cctmDires = cctmDires;
    }
   
    public CctmCodpId getId() {
        return this.id;
    }
    
    public void setId(CctmCodpId id) {
        this.id = id;
    }
    public CctmCata getCctmCataByIdTipo() {
        return this.cctmCataByIdTipo;
    }
    
    public void setCctmCataByIdTipo(CctmCata cctmCataByIdTipo) {
        this.cctmCataByIdTipo = cctmCataByIdTipo;
    }
    public CctmCata getCctmCataByIdEsta() {
        return this.cctmCataByIdEsta;
    }
    
    public void setCctmCataByIdEsta(CctmCata cctmCataByIdEsta) {
        this.cctmCataByIdEsta = cctmCataByIdEsta;
    }
    public String getNomCodp() {
        return this.nomCodp;
    }
    
    public void setNomCodp(String nomCodp) {
        this.nomCodp = nomCodp;
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
    public Set<CctmDire> getCctmDires() {
        return this.cctmDires;
    }
    
    public void setCctmDires(Set<CctmDire> cctmDires) {
        this.cctmDires = cctmDires;
    }




}


