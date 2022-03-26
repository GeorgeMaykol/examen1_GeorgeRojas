package com.idatidatrestapi.service;

import java.util.List;

import com.idatidatrestapi.dto.CursoRequestDto;
import com.idatidatrestapi.model.Curso;


public interface CursoService {
	
	public void guardarCurso(CursoRequestDto c);
	public void eliminarCurso(Long	id);
	public void editarCurso(Curso c);
	public List<Curso> listarCursos();
	public Curso cursoById(Long id);

}
