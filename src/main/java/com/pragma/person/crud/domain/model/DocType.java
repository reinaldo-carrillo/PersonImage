package com.pragma.person.crud.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DocType {
	CEDULA_CIUDADANIA("1", "CC", "Cedula de ciudadania"),
	TARJETA_IDENTIDAD("2", "TI", "Tarjeta de identidad"),
	CEDULA_EXTRANJERIA("3", "CE", "Cedula de extranjeria"),
	UNICO_IDENTIFICACION_PERSONAL("4", "NUIP", "Numero unico de identificacion personal"),
	DRIVING_LICENSE("5", "DL", "Licencia de conduccion americana"),
	IDENTIFICATION_CARD("6", "IC", "Tarjeta de identificacion americana"),
	IDENTIFICACION_TRIBUTARIA("7", "NIT", "Numero de identificacion tributaria"),
	PERMISO_ESPECIAL("8", "PEP", "Permiso especial de permanencia"),
	NACIONAL_IDENTIDAD("9", "DNI", "Documento nacional de identidad"),
	PASAPORTE("10", "PAP", "Pasaporte");
    
	DocType(
			String id, 
			String abreviation, 
			String name) {
		this.id = id;
		this.abreviation = abreviation;
		this.name = name;
	}
	private String id;
    private String abreviation;
    private String name;
}

