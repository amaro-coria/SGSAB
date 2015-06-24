package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CctmPers generated by hbm2java
 */
public class CctmPers  implements java.io.Serializable {


     private int idPers;
     private CctmCata cctmCataByIdEper;
     private CctmCata cctmCataByIdEciv;
     private CctmCata cctmCataByIdPais;
     private CctmCata cctmCataByIdEsta;
     private CctmCata cctmCataByIdSexo;
     private CctmCata cctmCataByIdTper;
     private CctmCata cctmCataByIdTipo;
     private CctmCata cctmCataByIdPaes;
     private String apePat;
     private String apeMat;
     private String nomb;
     private String razSoc;
     private String rfc;
     private String curp;
     private Date fchNaci;
     private Date fchAlta;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idConSis;
     private Set<CaupUsuaPref> caupUsuaPrefs = new HashSet<CaupUsuaPref>(0);
     private Set<CctmEmp> cctmEmps = new HashSet<CctmEmp>(0);

    public CctmPers() {
    }

	
    public CctmPers(int idPers, CctmCata cctmCataByIdEsta, String usrCrea, Date fchCrea) {
        this.idPers = idPers;
        this.cctmCataByIdEsta = cctmCataByIdEsta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CctmPers(int idPers, CctmCata cctmCataByIdEper, CctmCata cctmCataByIdEciv, CctmCata cctmCataByIdPais, CctmCata cctmCataByIdEsta, CctmCata cctmCataByIdSexo, CctmCata cctmCataByIdTper, CctmCata cctmCataByIdTipo, CctmCata cctmCataByIdPaes, String apePat, String apeMat, String nomb, String razSoc, String rfc, String curp, Date fchNaci, Date fchAlta, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Integer idConSis, Set<CaupUsuaPref> caupUsuaPrefs, Set<CctmEmp> cctmEmps) {
       this.idPers = idPers;
       this.cctmCataByIdEper = cctmCataByIdEper;
       this.cctmCataByIdEciv = cctmCataByIdEciv;
       this.cctmCataByIdPais = cctmCataByIdPais;
       this.cctmCataByIdEsta = cctmCataByIdEsta;
       this.cctmCataByIdSexo = cctmCataByIdSexo;
       this.cctmCataByIdTper = cctmCataByIdTper;
       this.cctmCataByIdTipo = cctmCataByIdTipo;
       this.cctmCataByIdPaes = cctmCataByIdPaes;
       this.apePat = apePat;
       this.apeMat = apeMat;
       this.nomb = nomb;
       this.razSoc = razSoc;
       this.rfc = rfc;
       this.curp = curp;
       this.fchNaci = fchNaci;
       this.fchAlta = fchAlta;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idConSis = idConSis;
       this.caupUsuaPrefs = caupUsuaPrefs;
       this.cctmEmps = cctmEmps;
    }
   
    public int getIdPers() {
        return this.idPers;
    }
    
    public void setIdPers(int idPers) {
        this.idPers = idPers;
    }
    public CctmCata getCctmCataByIdEper() {
        return this.cctmCataByIdEper;
    }
    
    public void setCctmCataByIdEper(CctmCata cctmCataByIdEper) {
        this.cctmCataByIdEper = cctmCataByIdEper;
    }
    public CctmCata getCctmCataByIdEciv() {
        return this.cctmCataByIdEciv;
    }
    
    public void setCctmCataByIdEciv(CctmCata cctmCataByIdEciv) {
        this.cctmCataByIdEciv = cctmCataByIdEciv;
    }
    public CctmCata getCctmCataByIdPais() {
        return this.cctmCataByIdPais;
    }
    
    public void setCctmCataByIdPais(CctmCata cctmCataByIdPais) {
        this.cctmCataByIdPais = cctmCataByIdPais;
    }
    public CctmCata getCctmCataByIdEsta() {
        return this.cctmCataByIdEsta;
    }
    
    public void setCctmCataByIdEsta(CctmCata cctmCataByIdEsta) {
        this.cctmCataByIdEsta = cctmCataByIdEsta;
    }
    public CctmCata getCctmCataByIdSexo() {
        return this.cctmCataByIdSexo;
    }
    
    public void setCctmCataByIdSexo(CctmCata cctmCataByIdSexo) {
        this.cctmCataByIdSexo = cctmCataByIdSexo;
    }
    public CctmCata getCctmCataByIdTper() {
        return this.cctmCataByIdTper;
    }
    
    public void setCctmCataByIdTper(CctmCata cctmCataByIdTper) {
        this.cctmCataByIdTper = cctmCataByIdTper;
    }
    public CctmCata getCctmCataByIdTipo() {
        return this.cctmCataByIdTipo;
    }
    
    public void setCctmCataByIdTipo(CctmCata cctmCataByIdTipo) {
        this.cctmCataByIdTipo = cctmCataByIdTipo;
    }
    public CctmCata getCctmCataByIdPaes() {
        return this.cctmCataByIdPaes;
    }
    
    public void setCctmCataByIdPaes(CctmCata cctmCataByIdPaes) {
        this.cctmCataByIdPaes = cctmCataByIdPaes;
    }
    public String getApePat() {
        return this.apePat;
    }
    
    public void setApePat(String apePat) {
        this.apePat = apePat;
    }
    public String getApeMat() {
        return this.apeMat;
    }
    
    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }
    public String getNomb() {
        return this.nomb;
    }
    
    public void setNomb(String nomb) {
        this.nomb = nomb;
    }
    public String getRazSoc() {
        return this.razSoc;
    }
    
    public void setRazSoc(String razSoc) {
        this.razSoc = razSoc;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getCurp() {
        return this.curp;
    }
    
    public void setCurp(String curp) {
        this.curp = curp;
    }
    public Date getFchNaci() {
        return this.fchNaci;
    }
    
    public void setFchNaci(Date fchNaci) {
        this.fchNaci = fchNaci;
    }
    public Date getFchAlta() {
        return this.fchAlta;
    }
    
    public void setFchAlta(Date fchAlta) {
        this.fchAlta = fchAlta;
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
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public Set<CaupUsuaPref> getCaupUsuaPrefs() {
        return this.caupUsuaPrefs;
    }
    
    public void setCaupUsuaPrefs(Set<CaupUsuaPref> caupUsuaPrefs) {
        this.caupUsuaPrefs = caupUsuaPrefs;
    }
    public Set<CctmEmp> getCctmEmps() {
        return this.cctmEmps;
    }
    
    public void setCctmEmps(Set<CctmEmp> cctmEmps) {
        this.cctmEmps = cctmEmps;
    }




}

