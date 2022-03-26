package com.idatidatrestapi.dto;

import com.idatidatrestapi.model.Malla;

public class CursoResponseDto {
	
	private Long idCurso;
	private String curso;
	private String descripcion;
	private Malla idMalla;
	public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Malla getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Malla idMalla) {
		this.idMalla = idMalla;
	}
	
	

}
