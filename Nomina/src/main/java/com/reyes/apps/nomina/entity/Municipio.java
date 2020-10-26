package com.reyes.apps.nomina.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Municipio implements Serializable{

	private static final long serialVersionUID = 2892289524193850702L;


	@EmbeddedId
	private MunicipioPk municipioPk;
	
	private String nombreMunicipio;
	
	public Municipio() {
		
	}

	public MunicipioPk getMunicipioPk() {
		return municipioPk;
	}

	public void setMunicipioPk(MunicipioPk municipioPk) {
		this.municipioPk = municipioPk;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}
	
	public static void main() {
		Municipio municipio = new Municipio();
		municipio.getMunicipioPk().getIdMunicipio();
		municipio.getMunicipioPk().getDepartamento().getIdDepartamento();
	}


}
