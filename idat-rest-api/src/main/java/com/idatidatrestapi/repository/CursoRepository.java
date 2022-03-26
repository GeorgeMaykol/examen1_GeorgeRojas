package com.idatidatrestapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idatidatrestapi.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
