package com.alamesa.proyecto.dto.plato;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlatoRequestDto {

	private String nombre;
	
	private String descripcion;
	
	private float precio;
	
}
