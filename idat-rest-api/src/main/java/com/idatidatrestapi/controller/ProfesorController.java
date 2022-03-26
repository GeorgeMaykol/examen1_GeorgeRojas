package com.idatidatrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idatidatrestapi.model.Profesor;
import com.idatidatrestapi.service.ProfesorService;

@Controller
@RequestMapping("/profesor/v1")
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping(method = RequestMethod.GET, path= "/listar")
	public ResponseEntity<List<Profesor>>listar(){
		
		return new ResponseEntity<List<Profesor>>(service.listarProfesores(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Profesor profesor){
		service.guardarProfesor(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<Profesor> cursoById(@PathVariable Long id){
		Profesor profesor = service.profesorById(id);
		
		if(profesor != null){
			return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
			
		}
		return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id){
		Profesor malla = service.profesorById(id);
		if(malla != null) {
			service.eliminarProfesor(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody Profesor profeso){
		Profesor profesor = service.profesorById(profeso.getIdProfesor());
		if(profesor != null) {
			service.editarProfesor(profesor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
