package com.idatidatrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idatidatrestapi.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{


}
