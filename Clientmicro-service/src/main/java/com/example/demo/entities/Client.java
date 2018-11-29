package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Client implements Serializable{
	@Id
	private long code;
	private String nom;
	private double prenom;
	private Date dateNaissance;
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrenom() {
		return prenom;
	}
	public void setPrenom(double prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Client(long code, String nom, double prenom, Date dateNaissance) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public Client() {}
	
	
}
