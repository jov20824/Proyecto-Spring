package com.alamesa.proyecto.dto.pedido;

import java.util.List;

import com.alamesa.proyecto.entity.Cliente;
import com.alamesa.proyecto.entity.Contiene;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PedidoRequestDto {
	
	private String horaReserva;

	private List<Contiene> contiene;

	private Cliente cliente;
}
