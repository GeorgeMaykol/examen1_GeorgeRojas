package com.idatidatrestapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="profesor")
@Entity
public class Profesor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4071964421974542886L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfesor;
	private String profesor;
	public Long getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Long idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	
}
