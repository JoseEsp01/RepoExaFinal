package com.ista.jose_exaf.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "restaurante")
@Data
public class Restaurante {

	private String nombre;
	
	private String telefono;
	
	private String correo;
	
	private String direccion;
	
	private List<Cliente> listCliente;
}
