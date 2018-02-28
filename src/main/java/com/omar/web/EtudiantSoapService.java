package com.omar.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omar.dao.EtudiantRepository;
import com.omar.dao.FormationRepository;
import com.omar.entities.Etudiant;
import com.omar.entities.Formation;

@Component
@WebService
public class EtudiantSoapService {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@WebMethod(operationName="listEtudiant")
	public List<Etudiant> list(){
		return etudiantRepository.findAll();
	}
	
	@WebMethod
	public Etudiant getOne(@WebParam(name="id")Long id) {
		return etudiantRepository.findOne(id);
	}
	
	@WebMethod
	public Formation save(@WebParam(name="formation") Formation f) {
		return formationRepository.save(f);
	}
}
