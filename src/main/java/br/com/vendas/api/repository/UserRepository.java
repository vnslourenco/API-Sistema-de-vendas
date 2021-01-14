package br.com.vendas.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.com.vendas.api.modelo.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(long id);
	User findByName(String name);
	User findByBirthdate(String birthdate);
	User findByEmail(String email);
	
	List<User> findByNameContaining(@Param("name") String name);
	
}
