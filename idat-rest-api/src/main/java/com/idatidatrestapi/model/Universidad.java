package com.idatidatrestapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="universidad")
@Entity
public class Universidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 664644573952653610L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUniversidad;
	private String universidad;
	public Long getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Long idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	
}
