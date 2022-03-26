package com.idatidatrestapi.service;

import java.util.List;

import com.idatidatrestapi.model.Profesor;

public interface ProfesorService {
	
	public void guardarProfesor(Profesor p);
	public void eliminarProfesor(Long	id);
	public void editarProfesor(Profesor p);
	public List<Profesor> listarProfesores();
	public Profesor profesorById(Long id);

}
