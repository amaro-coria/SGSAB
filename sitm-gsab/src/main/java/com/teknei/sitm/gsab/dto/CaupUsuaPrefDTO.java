package com.teknei.sitm.gsab.dto;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(of = { "idUsuaPref" })
@ToString(of = { "idUsuaPref" })
public class CaupUsuaPrefDTO {
	private int idUsuaPref;
	private String persName;
	private String persApePat;
	private String persApeMat;
	private String persCURP;
	private Date persFnac;
	private String tel;
	private String mail;
}
