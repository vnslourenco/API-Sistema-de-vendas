package br.com.vendas.api.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUser;
	private String name;
	@Column(unique=true)
	private String email;
	private String birthdate;
	private LocalDateTime createdAt = LocalDateTime.now();
	private LocalDateTime updatedAt = LocalDateTime.now();
	private boolean enabled = true;
	
	public User() {
		
	}
	
	public User(String name, String email, String birthdate) {
	    this.name = name;
	    this.email = email;
	    this.birthdate = birthdate;
	}

	public long getIdUser() {
		return idUser;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
}
