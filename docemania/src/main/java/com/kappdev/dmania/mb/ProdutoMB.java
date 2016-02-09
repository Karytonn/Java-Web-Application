package com.kappdev.dmania.mb;

import com.kappdev.dmania.bc.ProdutoBC;
import com.kappdev.dmania.bean.Produto;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;




@ManagedBean(name = "ProdutoMB")
@ViewScoped
public class ProdutoMB{
	
	private Produto bean;
	private ProdutoBC controle;
	private List<Produto> produtos;
	private Boolean startUpdate;
	private Produto update;
	private int qtn;
	
	@PostConstruct
	public void init(){
		this.bean = new Produto();
		this.controle = new ProdutoBC();
		this.produtos = controle.select();
		this.startUpdate = false;
		this.update = null;
		this.qtn = controle.selectQtn();
	}
	
	
	
	public Produto getBean() {
		return bean;
	}

	public void setBean(Produto bean) {
		this.bean = bean;
	}

	public ProdutoBC getControle() {
		return controle;
	}

	public void setControle(ProdutoBC controle) {
		this.controle = controle;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Boolean getStartUpdate() {
		return startUpdate;
	}

	public void setStartUpdate(Boolean startUpdate) {
		this.startUpdate = startUpdate;
	}

	public Produto getUpdate() {
		return update;
	}

	public void setUpdate(Produto update) {
		this.update = update;
	}
	
	public int getQtn() {
		return qtn;
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
