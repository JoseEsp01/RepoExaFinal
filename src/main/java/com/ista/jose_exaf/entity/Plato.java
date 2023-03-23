package com.ista.jose_exaf.entity;

import org.springframework.data.mongodb.core.mapping.Document;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "plato")
@Data
public class Plato {

	private String nombrePlato;
	
	private String descripcion;
	
	private String precio;
}
