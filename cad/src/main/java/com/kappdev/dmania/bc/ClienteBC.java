package com.kappdev.dmania.bc;

import com.kappdev.dmania.bean.Cliente;
import com.kappdev.dmania.dao.ClienteDao;
import java.util.List;



public class ClienteBC{
	
	ClienteDao fd = new ClienteDao();

	public void insert(Cliente c) {
		fd.insert(c);		
	}

	public void delete(Cliente c) {
		fd.delete(c);		
	}

	public void update(Cliente c) {
		fd.update(c);
	}

	public List<Cliente> select() {
		return fd.select();
	}

	public int selectQtn() {
		return fd.selectQtn();
	}

	
	
}
