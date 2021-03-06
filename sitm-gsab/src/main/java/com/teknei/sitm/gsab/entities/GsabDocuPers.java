package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GsabDocuPers generated by hbm2java
 */
public class GsabDocuPers  implements java.io.Serializable {


     private int idDocuPers;
     private CaupUsuaPref caupUsuaPref;
     private CctmCata cctmCataByIdTipo;
     private CctmCata cctmCataByIdEsta;
     private CctmEmp cctmEmp;
     private byte[] docuIdenAdju;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;

    public GsabDocuPers() {
    }

	
    public GsabDocuPers(int idDocuPers, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, String usrCrea, Date fchCrea) {
        this.idDocuPers = idDocuPers;
        this.cctmCataByIdTipo = cctmCataByIdTipo;
        this.cctmCataByIdEsta = cctmCataByIdEsta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public GsabDocuPers(int idDocuPers, CaupUsuaPref caupUsuaPref, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, CctmEmp cctmEmp, byte[] docuIdenAdju, String usrCrea, Date fchCrea, String usrModi, Date fchModi) {
       this.idDocuPers = idDocuPers;
       this.caupUsuaPref = caupUsuaPref;
       this.cctmCataByIdTipo = cctmCataByIdTipo;
       this.cctmCataByIdEsta = cctmCataByIdEsta;
       this.cctmEmp = cctmEmp;
       this.docuIdenAdju = docuIdenAdju;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
    }
   
    public int getIdDocuPers() {
        return this.idDocuPers;
    }
    
    public void setIdDocuPers(int idDocuPers) {
        this.idDocuPers = idDocuPers;
    }
    public CaupUsuaPref getCaupUsuaPref() {
        return this.caupUsuaPref;
    }
    
    public void setCaupUsuaPref(CaupUsuaPref caupUsuaPref) {
        this.caupUsuaPref = caupUsuaPref;
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
    public CctmEmp getCctmEmp() {
        return this.cctmEmp;
    }
    
    public void setCctmEmp(CctmEmp cctmEmp) {
        this.cctmEmp = cctmEmp;
    }
    public byte[] getDocuIdenAdju() {
        return this.docuIdenAdju;
    }
    
    public void setDocuIdenAdju(byte[] docuIdenAdju) {
        this.docuIdenAdju = docuIdenAdju;
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




}


