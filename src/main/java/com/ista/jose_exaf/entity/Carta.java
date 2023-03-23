package com.ista.jose_exaf.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "carta")
@Data
public class Carta {

	private String nombre;
	
	private String categoria;
	
	private int cantidad;
	
	private List<Plato> listPlatos;
}
