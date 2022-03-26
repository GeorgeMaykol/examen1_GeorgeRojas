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

import com.idatidatrestapi.dto.CursoRequestDto;
import com.idatidatrestapi.model.Curso;
import com.idatidatrestapi.service.CursoService;

@Controller
@RequestMapping("/curso/v1")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@RequestMapping(method = RequestMethod.GET, path= "/listar")
	public ResponseEntity<List<Curso>>listar(){
		
		return new ResponseEntity<List<Curso>>(service.listarCursos(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody CursoRequestDto curso){
		service.guardarCurso(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method= RequestMethod.GET, path="/listar/{id}")
	public @ResponseBody ResponseEntity<Curso> cursoById(@PathVariable Long id){
		Curso curso = service.cursoById(id);
		
		if(curso != null){
			return new ResponseEntity<Curso>(curso, HttpStatus.OK);
			
		}
		return new ResponseEntity<Curso>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(method= RequestMethod.DELETE, path="/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id){
		Curso curso = service.cursoById(id);
		if(curso != null) {
			service.eliminarCurso(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method= RequestMethod.PUT, path="/editar")
	public ResponseEntity<Void> editar(@RequestBody Curso curs){
		Curso curso = service.cursoById(curs.getIdCurso());
		if(curso != null) {
			service.editarCurso(curso);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	

}
