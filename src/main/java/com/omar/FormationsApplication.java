package com.omar;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.omar.dao.EtudiantRepository;
import com.omar.dao.FormationRepository;
import com.omar.entities.Etudiant;
import com.omar.entities.Formation;

@SpringBootApplication
public class FormationsApplication implements CommandLineRunner{
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	public static void main(String[] args) {
		SpringApplication.run(FormationsApplication.class, args);
		
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		Etudiant e = new Etudiant();
		Stream.of("Java","JEE","Oracle").forEach(nF->{
			Formation f = new Formation();
			f.setNom(nF); f.setDuree(21);
			formationRepository.save(f);
		});
		
		
		etudiantRepository.save(new Etudiant(null, "Omar1", "Farhani", new Formation(1L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "Omar2", "Farhani", new Formation(2L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "Omar3", "Farhani", new Formation(3L,null,0,null) ));
		
		
		etudiantRepository.save(new Etudiant(null, "John1", "Doe", new Formation(1L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "John2", "Doe", new Formation(2L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "John3", "Doe", new Formation(3L,null,0,null) ));

		
		etudiantRepository.save(new Etudiant(null, "Project1", "Lombok", new Formation(1L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "Project2", "Lombok", new Formation(1L,null,0,null) ));
		etudiantRepository.save(new Etudiant(null, "Project3", "Lombok", new Formation(1L,null,0,null) ));
		
		formationRepository.findAll().forEach(f-> {
			System.out.println(f.getNom());
		});

	}
}
