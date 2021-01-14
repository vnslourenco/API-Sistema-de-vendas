package br.com.vendas.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.api.modelo.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Optional<Product> findByIdProduct(long idProduct);
	
	

}
