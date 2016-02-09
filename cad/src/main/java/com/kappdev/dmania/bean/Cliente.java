package com.kappdev.dmania.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Cliente extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private Integer codCliente;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataCadastro;
	
	
	
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

	
	
}
