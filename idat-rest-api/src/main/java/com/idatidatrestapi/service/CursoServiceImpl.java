package com.idatidatrestapi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idatidatrestapi.dto.CursoRequestDto;
import com.idatidatrestapi.model.Curso;
import com.idatidatrestapi.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(CursoRequestDto c) {
		// TODO Auto-generated method stub
		Curso curso = new Curso();
		BeanUtils.copyProperties(c, curso);
		repository.save(curso);
	}

	@Override
	public void eliminarCurso(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void editarCurso(Curso c) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(c);

	}

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Curso cursoById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
