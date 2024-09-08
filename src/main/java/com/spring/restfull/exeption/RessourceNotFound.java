package com.spring.restfull.exeption;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RessourceNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ressourceName;
	private String fieldName;
	private Object fieldValue;

	public RessourceNotFound(String ressourceName, String fieldName, Object fieldValue) {
		super(String.format("% not found with %s : '%s'", ressourceName, fieldName, fieldValue));
		this.ressourceName = ressourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getRessourceName() {
		return ressourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

}
