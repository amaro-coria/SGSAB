package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GsabLogOper generated by hbm2java
 */
public class GsabLogOper  implements java.io.Serializable {


     private long idLogOper;
     private GsabModOper gsabModOper;
     private GsabSmodOper gsabSmodOper;
     private String codMsgApi;
     private String msgApiOpe;
     private Date fchCrea;
     private String usrCrea;

    public GsabLogOper() {
    }

	
    public GsabLogOper(long idLogOper, Date fchCrea, String usrCrea) {
        this.idLogOper = idLogOper;
        this.fchCrea = fchCrea;
        this.usrCrea = usrCrea;
    }
    public GsabLogOper(long idLogOper, GsabModOper gsabModOper, GsabSmodOper gsabSmodOper, String codMsgApi, String msgApiOpe, Date fchCrea, String usrCrea) {
       this.idLogOper = idLogOper;
       this.gsabModOper = gsabModOper;
       this.gsabSmodOper = gsabSmodOper;
       this.codMsgApi = codMsgApi;
       this.msgApiOpe = msgApiOpe;
       this.fchCrea = fchCrea;
       this.usrCrea = usrCrea;
    }
   
    public long getIdLogOper() {
        return this.idLogOper;
    }
    
    public void setIdLogOper(long idLogOper) {
        this.idLogOper = idLogOper;
    }
    public GsabModOper getGsabModOper() {
        return this.gsabModOper;
    }
    
    public void setGsabModOper(GsabModOper gsabModOper) {
        this.gsabModOper = gsabModOper;
    }
    public GsabSmodOper getGsabSmodOper() {
        return this.gsabSmodOper;
    }
    
    public void setGsabSmodOper(GsabSmodOper gsabSmodOper) {
        this.gsabSmodOper = gsabSmodOper;
    }
    public String getCodMsgApi() {
        return this.codMsgApi;
    }
    
    public void setCodMsgApi(String codMsgApi) {
        this.codMsgApi = codMsgApi;
    }
    public String getMsgApiOpe() {
        return this.msgApiOpe;
    }
    
    public void setMsgApiOpe(String msgApiOpe) {
        this.msgApiOpe = msgApiOpe;
    }
    public Date getFchCrea() {
        return this.fchCrea;
    }
    
    public void setFchCrea(Date fchCrea) {
        this.fchCrea = fchCrea;
    }
    public String getUsrCrea() {
        return this.usrCrea;
    }
    
    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }




}


