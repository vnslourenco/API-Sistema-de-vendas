package br.com.vendas.api.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vendas.api.dto.UserDto;
import br.com.vendas.api.modelo.User;
import br.com.vendas.api.repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody UserDto dto) throws Exception {
		
		String expression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		try {	
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher m = pattern.matcher(dto.getEmail());
			
			if (m.find()) {
			User user = userRepository.save(dto.turnUserToDto());
			return new ResponseEntity<>(user, HttpStatus.CREATED);
			} else {
				throw new NullPointerException();
			}
		} catch (Exception e) {
			throw new Exception ("Erro!");
		}
		
	}
	
	@GetMapping("/user")
	public List<User> listUser() {
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User listUniqueUser(@PathVariable (value="id") long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/user/name/{name}")
	public List<User> nameSearch(@PathVariable (value="name") String name) {
		return userRepository.findByNameContaining(name);
	}
	
	@GetMapping("/user/birthdate/{birthdate}")
	public User birthdateSearch(@PathVariable (value="birthdate") String birthdate) {
		return userRepository.findByBirthdate(birthdate);
	}
	
	@GetMapping("/user/email/{email}")
	public User emailSearch(@PathVariable (value="email") String email) {
		return userRepository.findByEmail(email);
	}
	

}
