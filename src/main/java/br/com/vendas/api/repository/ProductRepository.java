package br.com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.api.modelo.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Product findById(long idProduct);

}
