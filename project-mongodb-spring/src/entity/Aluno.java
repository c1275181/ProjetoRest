package entity;

import java.io.Serializable;

public class Aluno implements Serializable {

	
	private Object id;
	private String nome;
	private String email;
	private String sexo;
	
	
	
	public Aluno() {
	
	}
	
	
	public Aluno(Object id, String nome, String email, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo + "]";
	}




	public Object getId() {
		return id;
	}




	public void setId(Object id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
	
}
