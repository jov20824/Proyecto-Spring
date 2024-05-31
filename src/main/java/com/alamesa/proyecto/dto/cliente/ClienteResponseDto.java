package com.alamesa.proyecto.dto.cliente;

import java.util.List;

import com.alamesa.proyecto.entity.Pedido;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteResponseDto {

	private String nombre;
	
	private int telefono;

	private List<Pedido> pedidos;
}
