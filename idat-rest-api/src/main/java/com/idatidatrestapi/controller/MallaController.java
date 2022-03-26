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

import com.idatidatrestapi.model.Malla;
import com.idatidatrestapi.service.MallaService;

@Controller
@RequestMapping("/malla/v1")
public class MallaController {
	
	@Autowired
	private MallaService service;
	
	@RequestMapping(method = RequestMethod.GET, path= "/listar")
	public ResponseEntity<List<Malla>>listar(){
		
		return new ResponseEntity<List<Malla>>(service.listarMallas(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Malla malla){
		service.guardarMalla(malla);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<Malla> cursoById(@PathVariable Long id){
		Malla malla = service.mallaById(id);
		
		if(malla != null){
			return new ResponseEntity<Malla>(malla, HttpStatus.OK);
			
		}
		return new ResponseEntity<Malla>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id){
		Malla malla = service.mallaById(id);
		if(malla != null) {
			service.eliminarMalla(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody Malla mall){
		Malla malla = service.mallaById(mall.getIdMalla());
		if(malla != null) {
			service.editarMalla(malla);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}
