package com.idatidatrestapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idatidatrestapi.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long>{
	

}
