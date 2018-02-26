package com.omar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.omar.entities.Formation;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
