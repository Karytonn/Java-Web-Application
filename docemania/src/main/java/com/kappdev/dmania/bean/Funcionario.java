package com.kappdev.dmania.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	
	@Column(length = 10)
	private Integer codFuncionario;

	
	public Integer getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(Integer codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	
	
	
	
}
