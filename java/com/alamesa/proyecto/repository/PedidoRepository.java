package com.alamesa.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alamesa.proyecto.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
