package com.idatidatrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idatidatrestapi.model.Profesor;
import com.idatidatrestapi.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository repository;
	
	
	@Override
	public void guardarProfesor(Profesor p) {
		// TODO Auto-generated method stub
		repository.save(p);

	}

	@Override
	public void eliminarProfesor(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void editarProfesor(Profesor p) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(p);

	}

	@Override
	public List<Profesor> listarProfesores() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Profesor profesorById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
