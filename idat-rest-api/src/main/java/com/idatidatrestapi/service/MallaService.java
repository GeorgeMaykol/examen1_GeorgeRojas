package com.idatidatrestapi.service;

import java.util.List;

import com.idatidatrestapi.model.Malla;

public interface MallaService{
	
	public void guardarMalla(Malla m);
	public void eliminarMalla(Long id);
	public void editarMalla(Malla m);
	public List<Malla> listarMallas();
	public Malla mallaById(Long id);

}
