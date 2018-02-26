package com.omar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omar.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {

}
