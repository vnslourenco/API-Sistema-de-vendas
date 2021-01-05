package br.com.vendas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vendas.api.modelo.User;
import br.com.vendas.api.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/user")
	public List<User> listUser() {
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User listUniqueUser(@PathVariable (value="id") long id) {
		return userRepository.findById(id);
	}
	
//	@GetMapping("/user/name/{name}")
//	public User nameSearch(@PathVariable (value="name") String name) {
//		return userRepository.findByNameContaining(name);
//	}
	
	@GetMapping("/user/birthdate/{birthdate}")
	public User birthdateSearch(@PathVariable (value="birthdate") String birthdate) {
		return userRepository.findByBirthdate(birthdate);
	}
	
	@GetMapping("/user/email/{email}")
	public User emailSearch(@PathVariable (value="email") String email) {
		return userRepository.findByEmail(email);
	}
	

}
