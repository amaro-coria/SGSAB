package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * CaupAsigTarjPref generated by hbm2java
 */
public class CaupAsigTarjPref  implements java.io.Serializable {


     private int idAsigTarjPref;
     private CaupUsuaPref caupUsuaPref;
     private CctmCata cctmCataByTipUsua;
     private CctmCata cctmCataByIdEsta;
     private CctmCata cctmCataByIdTipo;
     private SbopTarj sbopTarj;
     private Integer idCeop;
     private Integer idEqui;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;

    public CaupAsigTarjPref() {
    }

	
    public CaupAsigTarjPref(int idAsigTarjPref, CaupUsuaPref caupUsuaPref, CctmCata cctmCataByTipUsua, CctmCata cctmCataByIdEsta, CctmCata cctmCataByIdTipo, SbopTarj sbopTarj, String usrCrea, Date fchCrea) {
        this.idAsigTarjPref = idAsigTarjPref;
        this.caupUsuaPref = caupUsuaPref;
        this.cctmCataByTipUsua = cctmCataByTipUsua;
        this.cctmCataByIdEsta = cctmCataByIdEsta;
        this.cctmCataByIdTipo = cctmCataByIdTipo;
        this.sbopTarj = sbopTarj;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CaupAsigTarjPref(int idAsigTarjPref, CaupUsuaPref caupUsuaPref, CctmCata cctmCataByTipUsua, CctmCata cctmCataByIdEsta, CctmCata cctmCataByIdTipo, SbopTarj sbopTarj, Integer idCeop, Integer idEqui, String usrCrea, Date fchCrea, String usrModi, Date fchModi) {
       this.idAsigTarjPref = idAsigTarjPref;
       this.caupUsuaPref = caupUsuaPref;
       this.cctmCataByTipUsua = cctmCataByTipUsua;
       this.cctmCataByIdEsta = cctmCataByIdEsta;
       this.cctmCataByIdTipo = cctmCataByIdTipo;
       this.sbopTarj = sbopTarj;
       this.idCeop = idCeop;
       this.idEqui = idEqui;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
    }
   
    public int getIdAsigTarjPref() {
        return this.idAsigTarjPref;
    }
    
    public void setIdAsigTarjPref(int idAsigTarjPref) {
        this.idAsigTarjPref = idAsigTarjPref;
    }
    public CaupUsuaPref getCaupUsuaPref() {
        return this.caupUsuaPref;
    }
    
    public void setCaupUsuaPref(CaupUsuaPref caupUsuaPref) {
        this.caupUsuaPref = caupUsuaPref;
    }
    public CctmCata getCctmCataByTipUsua() {
        return this.cctmCataByTipUsua;
    }
    
    public void setCctmCataByTipUsua(CctmCata cctmCataByTipUsua) {
        this.cctmCataByTipUsua = cctmCataByTipUsua;
    }
    public CctmCata getCctmCataByIdEsta() {
        return this.cctmCataByIdEsta;
    }
    
    public void setCctmCataByIdEsta(CctmCata cctmCataByIdEsta) {
        this.cctmCataByIdEsta = cctmCataByIdEsta;
    }
    public CctmCata getCctmCataByIdTipo() {
        return this.cctmCataByIdTipo;
    }
    
    public void setCctmCataByIdTipo(CctmCata cctmCataByIdTipo) {
        this.cctmCataByIdTipo = cctmCataByIdTipo;
    }
    public SbopTarj getSbopTarj() {
        return this.sbopTarj;
    }
    
    public void setSbopTarj(SbopTarj sbopTarj) {
        this.sbopTarj = sbopTarj;
    }
    public Integer getIdCeop() {
        return this.idCeop;
    }
    
    public void setIdCeop(Integer idCeop) {
        this.idCeop = idCeop;
    }
    public Integer getIdEqui() {
        return this.idEqui;
    }
    
    public void setIdEqui(Integer idEqui) {
        this.idEqui = idEqui;
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

