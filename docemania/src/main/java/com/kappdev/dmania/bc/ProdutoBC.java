package com.kappdev.dmania.bc;

import com.kappdev.dmania.bean.Produto;
import com.kappdev.dmania.dao.ProdutoDao;
import java.util.List;



public class ProdutoBC{
	ProdutoDao pd = new ProdutoDao();

	public void insert(Produto p) {
		pd.insert(p);
	}
	public void delete(Produto p) {
		pd.delete(p);
	}
	public void update(Produto p) {
		pd.update(p);
	}
	public List<Produto> select() {
		return pd.select();
	}
	public int selectQtn() {
		return pd.selectQtn();
	}

}
