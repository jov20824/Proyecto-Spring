package com.alamesa.proyecto.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String horaRealizado;
	
	private String horaReserva;
	
	
	@OneToMany(mappedBy="pedido", cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Contiene> contiene;
	
	@ManyToOne
	@JoinColumn(name="FK_CLIENTE")
	private Cliente cliente;

	
	
}
