package com.alamesa.proyecto.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.alamesa.proyecto.dto.contiene.ContieneRequestDto;
import com.alamesa.proyecto.dto.contiene.ContieneResponseDto;
import com.alamesa.proyecto.entity.Contiene;

@Mapper(componentModel="spring")
public interface ContieneMapper {

	public ContieneResponseDto mapToContieneDto(Contiene contiene);

	public List<ContieneResponseDto> mapToContieneDto(List<Contiene> contienes);
	
	public Contiene mapContieneRequestDtoToContiene(ContieneRequestDto contieneDto);
	
	public Contiene mapToContiene(Long id, ContieneRequestDto contieneDto);
	
	public ContieneResponseDto mapContieneRequestDtoToContieneResponseDto(ContieneRequestDto contieneDto);
}
