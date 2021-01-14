package br.com.vendas.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.vendas.api.modelo.Product;
import br.com.vendas.api.repository.ProductRepository;

@Component
public class ProjectStart implements CommandLineRunner {
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product("Iphone 12", 10000);
		productRepository.save(p1);
		
		Product p2 = new Product("Xiaomi", 1000);
		productRepository.save(p2);
		
		Product p3 = new Product("Samsung", 4000);
		productRepository.save(p3);
		
	}
	
	

}
