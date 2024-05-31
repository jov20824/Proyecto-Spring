package com.alamesa.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alamesa.proyecto.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findAllByOrderByCountByPedidosAsc();
	
	List<Cliente> findAllByOrderByCountByPedidosDesc();
}
