package com.reyes.apps.nomina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.apps.nomina.dao.MunicipioDao;
import com.reyes.apps.nomina.entity.Municipio;

@Service
public class IMunicpioServiceImpl implements IMunicpioService{

	@Autowired
	private MunicipioDao municipioDao;

	@Override
	public List<Municipio> findAll() {
		return this.municipioDao.findAll();
	}
	
	@Override
	public Municipio findMuncipioByIds(Long idMunicipio, Long idDepartamento) {
		return this.municipioDao.findMunicipioByIds(idMunicipio, idDepartamento);
	}
	
}
