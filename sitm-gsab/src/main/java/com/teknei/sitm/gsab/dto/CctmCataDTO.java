package com.teknei.sitm.gsab.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = { "idCata" })
@ToString(of = { "idCata" })
public class CctmCataDTO implements Serializable{

	private int idCata;
	private String codCata;
	private String codCort;
	private String codComp;
	private String desCort;
	private String desComp;
	private Integer ordeCata;
	private Integer idIdio;
	private int idEcat;
	private int idTcat;
}
