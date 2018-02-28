package com.omar.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//Indicating XmlTransient to be executed on a field
//Else you have to put XmlTransient on the method setter of the correspondant attribute
@XmlAccessorType(XmlAccessType.FIELD)
public class Formation implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	private String nom ;
	private int duree;
	
	@JsonIgnore
	//Prevents the mapping of a JavaBean property/type to XML representation
	@XmlTransient
	@OneToMany(mappedBy="formation")
	private Collection<Etudiant> etudiants;
	
	
}
