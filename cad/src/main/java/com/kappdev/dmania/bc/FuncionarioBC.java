package com.kappdev.dmania.bc;

import com.kappdev.dmania.bean.Funcionario;
import com.kappdev.dmania.dao.FuncionarioDao;
import java.util.List;


public class FuncionarioBC{
	
	FuncionarioDao fd = new FuncionarioDao();
	
	public void insert(Funcionario f) {
		fd.insert(f);		
	}

	public void delete(Funcionario f) {
		fd.delete(f);		
	}

	public void update(Funcionario f) {
		fd.update(f);
	}

	public List<Funcionario> select() {
		return fd.select();
	}

	
	
}
