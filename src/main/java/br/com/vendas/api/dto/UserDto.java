package br.com.vendas.api.dto;

import br.com.vendas.api.modelo.User;

public class UserDto {
	
	private String name;
	private String email;
	private String birthdate;

	public User turnUserToDto() {
		return new User(name, email, birthdate);
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


}
