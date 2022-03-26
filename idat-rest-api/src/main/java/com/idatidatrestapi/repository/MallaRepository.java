package com.idatidatrestapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idatidatrestapi.model.Malla;

@Repository
public interface MallaRepository extends JpaRepository<Malla, Long> {

	

}
