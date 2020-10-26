package com.reyes.apps.nomina.service;

import java.util.List;

import com.reyes.apps.nomina.entity.Municipio;

public interface IMunicpioService {
	
	public List<Municipio> findAll();
	public Municipio findMuncipioByIds(Long idMunicipio, Long idDepartamento);

}
