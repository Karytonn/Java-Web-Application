package com.kappdev.dmania.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.kappdev.dmania.bc.FuncionarioBC;
import com.kappdev.dmania.bean.Funcionario;



@ManagedBean(name = "FuncionarioMB")
@ViewScoped
public class FuncionarioMB {
	
	private Funcionario bean;
	private FuncionarioBC controle;
	private List<Funcionario> funcionarios;
	private Boolean startUpdate;
	private Funcionario update;
	
	@PostConstruct
	public void init(){
		this.bean = new Funcionario();
		this.controle = new FuncionarioBC();
		this.funcionarios = controle.select();
		this.startUpdate = false;
		this.update = null;
	
	}
	
	
	public Funcionario getBean() {
		return bean;
	}

	public void setBean(Funcionario bean) {
		this.bean = bean;
	}

	public FuncionarioBC getControle() {
		return controle;
	}

	public void setControle(FuncionarioBC controle) {
		this.controle = controle;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Boolean getStartUpdate() {
		return startUpdate;
	}

	public void setStartUpdate(Boolean startUpdate) {
		this.startUpdate = startUpdate;
	}

	public Funcionario getUpdate() {
		return update;
	}

	public void setUpdate(Funcionario update) {
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
