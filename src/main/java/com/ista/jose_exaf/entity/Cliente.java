package com.ista.jose_exaf.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "cliente")
@Data
public class Cliente {

	private String nombre;
	
	private String apellido;
	
	private String cedula;
	
	private String correo;
}
