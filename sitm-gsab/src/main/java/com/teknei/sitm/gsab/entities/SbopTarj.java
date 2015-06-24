package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SbopTarj generated by hbm2java
 */
public class SbopTarj  implements java.io.Serializable {


     private int idTarj;
     private CctmCata cctmCataByIdTcre;
     private CctmCata cctmCataByIdTtar;
     private CctmCata cctmCataByIdEdoTarj;
     private CctmCata cctmCataByIdTipo;
     private CctmCata cctmCataByIdEsta;
     private CctmCata cctmCataByIdTlla;
     private int idInv;
     private Date fchAlta;
     private Date fchVig;
     private Date fchCanc;
     private String detaCanc;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idAsgnTarj;
     private Integer idConSis;
     private Set<CaupAsigTarjPref> caupAsigTarjPrefs = new HashSet<CaupAsigTarjPref>(0);
     private Set<SbopTran> sbopTrans = new HashSet<SbopTran>(0);
     private Set<CaupUsuaEmpl> caupUsuaEmpls = new HashSet<CaupUsuaEmpl>(0);
     private Set<SbopTurn> sbopTurns = new HashSet<SbopTurn>(0);

    public SbopTarj() {
    }

	
    public SbopTarj(int idTarj, CctmCata cctmCataByIdTcre, CctmCata cctmCataByIdTtar, CctmCata cctmCataByIdEdoTarj, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, int idInv, Date fchAlta, Date fchVig, String usrCrea, Date fchCrea) {
        this.idTarj = idTarj;
        this.cctmCataByIdTcre = cctmCataByIdTcre;
        this.cctmCataByIdTtar = cctmCataByIdTtar;
        this.cctmCataByIdEdoTarj = cctmCataByIdEdoTarj;
        this.cctmCataByIdTipo = cctmCataByIdTipo;
        this.cctmCataByIdEsta = cctmCataByIdEsta;
        this.idInv = idInv;
        this.fchAlta = fchAlta;
        this.fchVig = fchVig;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public SbopTarj(int idTarj, CctmCata cctmCataByIdTcre, CctmCata cctmCataByIdTtar, CctmCata cctmCataByIdEdoTarj, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdEsta, CctmCata cctmCataByIdTlla, int idInv, Date fchAlta, Date fchVig, Date fchCanc, String detaCanc, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Integer idAsgnTarj, Integer idConSis, Set<CaupAsigTarjPref> caupAsigTarjPrefs, Set<SbopTran> sbopTrans, Set<CaupUsuaEmpl> caupUsuaEmpls, Set<SbopTurn> sbopTurns) {
       this.idTarj = idTarj;
       this.cctmCataByIdTcre = cctmCataByIdTcre;
       this.cctmCataByIdTtar = cctmCataByIdTtar;
       this.cctmCataByIdEdoTarj = cctmCataByIdEdoTarj;
       this.cctmCataByIdTipo = cctmCataByIdTipo;
       this.cctmCataByIdEsta = cctmCataByIdEsta;
       this.cctmCataByIdTlla = cctmCataByIdTlla;
       this.idInv = idInv;
       this.fchAlta = fchAlta;
       this.fchVig = fchVig;
       this.fchCanc = fchCanc;
       this.detaCanc = detaCanc;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idAsgnTarj = idAsgnTarj;
       this.idConSis = idConSis;
       this.caupAsigTarjPrefs = caupAsigTarjPrefs;
       this.sbopTrans = sbopTrans;
       this.caupUsuaEmpls = caupUsuaEmpls;
       this.sbopTurns = sbopTurns;
    }
   
    public int getIdTarj() {
        return this.idTarj;
    }
    
    public void setIdTarj(int idTarj) {
        this.idTarj = idTarj;
    }
    public CctmCata getCctmCataByIdTcre() {
        return this.cctmCataByIdTcre;
    }
    
    public void setCctmCataByIdTcre(CctmCata cctmCataByIdTcre) {
        this.cctmCataByIdTcre = cctmCataByIdTcre;
    }
    public CctmCata getCctmCataByIdTtar() {
        return this.cctmCataByIdTtar;
    }
    
    public void setCctmCataByIdTtar(CctmCata cctmCataByIdTtar) {
        this.cctmCataByIdTtar = cctmCataByIdTtar;
    }
    public CctmCata getCctmCataByIdEdoTarj() {
        return this.cctmCataByIdEdoTarj;
    }
    
    public void setCctmCataByIdEdoTarj(CctmCata cctmCataByIdEdoTarj) {
        this.cctmCataByIdEdoTarj = cctmCataByIdEdoTarj;
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
    public CctmCata getCctmCataByIdTlla() {
        return this.cctmCataByIdTlla;
    }
    
    public void setCctmCataByIdTlla(CctmCata cctmCataByIdTlla) {
        this.cctmCataByIdTlla = cctmCataByIdTlla;
    }
    public int getIdInv() {
        return this.idInv;
    }
    
    public void setIdInv(int idInv) {
        this.idInv = idInv;
    }
    public Date getFchAlta() {
        return this.fchAlta;
    }
    
    public void setFchAlta(Date fchAlta) {
        this.fchAlta = fchAlta;
    }
    public Date getFchVig() {
        return this.fchVig;
    }
    
    public void setFchVig(Date fchVig) {
        this.fchVig = fchVig;
    }
    public Date getFchCanc() {
        return this.fchCanc;
    }
    
    public void setFchCanc(Date fchCanc) {
        this.fchCanc = fchCanc;
    }
    public String getDetaCanc() {
        return this.detaCanc;
    }
    
    public void setDetaCanc(String detaCanc) {
        this.detaCanc = detaCanc;
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
    public Integer getIdAsgnTarj() {
        return this.idAsgnTarj;
    }
    
    public void setIdAsgnTarj(Integer idAsgnTarj) {
        this.idAsgnTarj = idAsgnTarj;
    }
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public Set<CaupAsigTarjPref> getCaupAsigTarjPrefs() {
        return this.caupAsigTarjPrefs;
    }
    
    public void setCaupAsigTarjPrefs(Set<CaupAsigTarjPref> caupAsigTarjPrefs) {
        this.caupAsigTarjPrefs = caupAsigTarjPrefs;
    }
    public Set<SbopTran> getSbopTrans() {
        return this.sbopTrans;
    }
    
    public void setSbopTrans(Set<SbopTran> sbopTrans) {
        this.sbopTrans = sbopTrans;
    }
    public Set<CaupUsuaEmpl> getCaupUsuaEmpls() {
        return this.caupUsuaEmpls;
    }
    
    public void setCaupUsuaEmpls(Set<CaupUsuaEmpl> caupUsuaEmpls) {
        this.caupUsuaEmpls = caupUsuaEmpls;
    }
    public Set<SbopTurn> getSbopTurns() {
        return this.sbopTurns;
    }
    
    public void setSbopTurns(Set<SbopTurn> sbopTurns) {
        this.sbopTurns = sbopTurns;
    }




}

