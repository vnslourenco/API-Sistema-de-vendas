package br.com.vendas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vendas.api.modelo.Product;
import br.com.vendas.api.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	
	@GetMapping("/product")
	public List<Product> listProduct() {
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{idProduct}")
	public Product listUniqueProduct(@PathVariable (value="idProduct") long list) {
		return productRepository.findById(list);
	}

}
