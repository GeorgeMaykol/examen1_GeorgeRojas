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

import com.idatidatrestapi.model.Universidad;
import com.idatidatrestapi.service.UniversidadService;

@Controller
@RequestMapping("/universidad/v1")
public class UniversidadController {
	
	@Autowired
	private UniversidadService service;
	
	@RequestMapping(method = RequestMethod.GET, path= "/listar")
	public ResponseEntity<List<Universidad>>listar(){
		
		return new ResponseEntity<List<Universidad>>(service.listarUniversidades(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Universidad universidad){
		service.guardarUniversidad(universidad);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<Universidad> cursoById(@PathVariable Long id){
		Universidad universidad = service.universidadById(id);
		
		if(universidad != null){
			return new ResponseEntity<Universidad>(universidad, HttpStatus.OK);
			
		}
		return new ResponseEntity<Universidad>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id){
		Universidad malla = service.universidadById(id);
		if(malla != null) {
			service.eliminarUniversidad(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody Universidad universida){
		Universidad universidad = service.universidadById(universida.getIdUniversidad());
		if(universidad != null) {
			service.editarUniversidad(universidad);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
