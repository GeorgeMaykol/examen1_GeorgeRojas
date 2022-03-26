package com.idatidatrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idatidatrestapi.model.Malla;
import com.idatidatrestapi.repository.MallaRepository;

@Service
public class MallaServiceImpl implements MallaService {
	
	@Autowired
	private MallaRepository repository;
	
	@Override
	public void guardarMalla(Malla m) {
		// TODO Auto-generated method stub
		repository.save(m);

	}

	@Override
	public void eliminarMalla(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void editarMalla(Malla m) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(m);

	}

	@Override
	public List<Malla> listarMallas() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Malla mallaById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
