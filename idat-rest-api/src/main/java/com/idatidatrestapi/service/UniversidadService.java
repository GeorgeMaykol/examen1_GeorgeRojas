package com.idatidatrestapi.service;

import java.util.List;

import com.idatidatrestapi.model.Universidad;

public interface UniversidadService {
	
	public void guardarUniversidad(Universidad u);
	public void eliminarUniversidad(Long id);
	public void editarUniversidad(Universidad u);
	public List<Universidad> listarUniversidades();
	public Universidad universidadById(Long id);

}
