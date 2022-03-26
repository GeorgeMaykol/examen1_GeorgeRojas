package com.idatidatrestapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="malla")
@Entity
public class Malla implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1260847153009747813L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMalla;
	private Date anio;
	public Long getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Long idMalla) {
		this.idMalla = idMalla;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	
	
	
	
}
