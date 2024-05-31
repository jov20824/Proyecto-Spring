package com.alamesa.proyecto.dto.contiene;

import com.alamesa.proyecto.entity.Pedido;
import com.alamesa.proyecto.entity.Plato;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContieneRequestDto {

	private Pedido pedido;
	
	private Plato plato;
	
	private int cantidad;
}
