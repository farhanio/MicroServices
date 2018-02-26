package com.omar.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omar.dao.EtudiantRepository;
import com.omar.entities.Etudiant;

@RestController
public class EtudiantRestController {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@GetMapping("/etudiants")
	public List<Etudiant> list(){
		return etudiantRepository.findAll();
	}
	
	@GetMapping("/etudiants/{id}")
	public Etudiant getOne(@PathVariable(name="id") Long id){
		return etudiantRepository.findOne(id);
	}
	
	@PostMapping("/etudiants")
	public Etudiant saveEtudiant(@RequestBody Etudiant e){
		return etudiantRepository.save(e);
	}
	
	@PutMapping("/etudiants/{id}")
	public Etudiant updateEtudiant(@PathVariable(name="id")Long id,@RequestBody Etudiant etudiant){
		etudiant.setId(id);
		return etudiantRepository.save(etudiant);
	}
	
	@DeleteMapping("/etudiants/{id}")
	public void deleteEtudiant(@PathVariable("id")Long id){
		etudiantRepository.delete(id);
		
	}
 }
