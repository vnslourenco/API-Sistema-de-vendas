package br.com.vendas.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vendas.api.dto.OrderDTOCadastrarForm;
import br.com.vendas.api.modelo.Orders;
import br.com.vendas.api.modelo.Product;
import br.com.vendas.api.modelo.User;
import br.com.vendas.api.repository.OrderRepository;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	UserController userController;
	
	@Autowired
	ProductController productController;

	@PostMapping("/order")
	public Orders createOrder(@RequestBody OrderDTOCadastrarForm dto) {
		Orders order = new Orders();
		
		List<Product> listaProduct = new ArrayList<Product>();
		
		User user = userController.listUniqueUser(dto.getIdUser());
		order.setIdUser(user);
		
		for (int i = 0; i < dto.getIdProduct().size(); i++) {
			Product product = productController.listUniqueProduct(dto.getIdProduct().get(i));
//			System.out.println(product.getDescription());
			listaProduct.add(product);
		}
		
		order.setIdProduct(listaProduct);
		
		System.out.println(order.toString());
		
		return orderRepository.save(order);
	
	}
	
	@GetMapping("/order")
	public List<Orders> listOrder() {
		return orderRepository.findAll();
	}
	
}
