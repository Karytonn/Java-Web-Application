package com.kappdev.dmania.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.kappdev.dmania.bc.ClienteBC;
import com.kappdev.dmania.bean.Cliente;



@ManagedBean(name = "ClienteMB")
@ViewScoped
public class ClienteMB {
	
	private Cliente bean;
	private ClienteBC controle;
	private List<Cliente> clientes;
	private Boolean startUpdate;
	private Cliente update;
	private int qtn;
	
	@PostConstruct
	public void init(){
		this.bean = new Cliente();
		this.controle = new ClienteBC();
		this.clientes = controle.select();
		this.startUpdate = false;
		this.update = null;
		this.qtn = controle.selectQtn();
	
	}
	

	
	
	public int getQtn() {
		return qtn;
	}

	public Cliente getBean() {
		return bean;
	}

	public void setBean(Cliente bean) {
		this.bean = bean;
	}

	public ClienteBC getControle() {
		return controle;
	}

	public void setControle(ClienteBC controle) {
		this.controle = controle;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Boolean getStartUpdate() {
		return startUpdate;
	}

	public void setStartUpdate(Boolean startUpdate) {
		this.startUpdate = startUpdate;
	}

	public Cliente getUpdate() {
		return update;
	}


	public void setUpdate(Cliente update) {
		this.update = update;
	}




	/* Metodo cadastrar */
	public void cadastrar() {
		this.controle.insert(this.bean);
		this.init();	
		
	}
	
	/* Metodo deletar */
	public void delete(){
		this.controle.delete(this.bean);
		this.init();
	}
	
	/* Metodo atualizar */
	public void update(){
		this.controle.update(this.bean);
		this.init();
	}
	
	/*
	 * Metodo responsavel por apresentar os valores a ser atualizados & Sumir
	 * com o btn "Cadastrar"
	 */
	public void ativaUpdate() {
		this.bean = this.update;
		this.startUpdate = true;
	}
}
