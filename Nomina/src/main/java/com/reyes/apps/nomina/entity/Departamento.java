package com.reyes.apps.nomina.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departamento implements Serializable{

	private static final long serialVersionUID = -4766382172560661573L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDepartamento;
	
	private String nombreDepartamento;
		
	public Departamento() {
		
	}

	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

}
