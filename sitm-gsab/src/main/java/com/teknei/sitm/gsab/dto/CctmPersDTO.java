package com.teknei.sitm.gsab.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of={"idPers"})
@ToString
public class CctmPersDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPers;
	private Integer idEper;
	private String idEperDsc;
	private Integer idEsta;
	private String idEstaDsc;
	private Integer idSexo;
	private String idSexoDsc;
	private Integer idTper;
	private String idTperDsc;
	private Integer idTipo;
	private String idTipoDsc;
	private Integer idEciv;
	private String idEcivDsc;
	private Integer idPais;
	private String idPaisDsc;
	private Integer idPaes;
	private String idPaesDsc;
	private String apePat;
	private String apeMat;
	private String nomb;
	private String razSoc;
	private String rfc;
	private String curp;
	private Date fchNaci;
	private Date fchAlta;
}
