package com.reyes.apps.nomina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reyes.apps.nomina.entity.Municipio;
import com.reyes.apps.nomina.service.IMunicpioService;

@RequestMapping("/api")
@RestController
public class MunicipioController{

	@Autowired
	private IMunicpioService municipioService;
	
	@GetMapping("/municipios")
	public List<Municipio> showAll(){
		return this.municipioService.findAll();
	}
	
	@GetMapping("/findMunicipio/{idMunicipio}/{idDepartamento}")
	public Municipio findMunicipio(@PathVariable Long idMunicipio, @PathVariable Long idDepartamento) {
		return this.municipioService.findMuncipioByIds(idMunicipio, idDepartamento);
	}

}
