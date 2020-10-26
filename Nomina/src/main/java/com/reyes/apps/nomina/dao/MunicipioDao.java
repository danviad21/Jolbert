package com.reyes.apps.nomina.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reyes.apps.nomina.entity.Municipio;

public interface MunicipioDao extends JpaRepository<Municipio, Long> {

	@Query("from Municipio m where m.municipioPk.idMunicipio = ?1 and m.municipioPk.departamento.idDepartamento = ?2")
	public Municipio findMunicipioByIds(Long idMunicipio, Long idDepartamento);
}
