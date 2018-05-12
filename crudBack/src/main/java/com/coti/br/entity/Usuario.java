package com.coti.br.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	private String primeiroNome;
	private String sobreNome;
	private String email;
	
	
	public Usuario(String primeiroNome, String sobreNome, String email) {
		super();
		this.primeiroNome = primeiroNome;
		this.sobreNome = sobreNome;
		this.email = email;
	}


	public Usuario() {
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
