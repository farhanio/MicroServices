package com.omar.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.omar.entities.Etudiant;


@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	
	@RestResource(path="/searchByName")
	public Page<Etudiant> findByNomContains(@Param("mc") String mc, Pageable pageable);
	
	public Page<Etudiant> findByNomStartsWith(@Param("mc") String mc, Pageable pageable);
}
