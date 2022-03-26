package com.idatidatrestapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="curso")
@Entity
public class Curso implements Serializable {

	
	private static final long serialVersionUID = -4339937578768666154L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
