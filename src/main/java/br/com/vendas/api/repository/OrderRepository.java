package br.com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.api.modelo.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

	
}
