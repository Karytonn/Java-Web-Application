package com.kappdev.dmania.dao;

import com.kappdev.dmania.bean.Produto;
import com.kappdev.dmania.util.HibernateUtil;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProdutoDao{
	
	
	public void insert(Produto p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(p);
		tx.commit();
		s.close();		
	}
	public void delete(Produto p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(p);
		tx.commit();
		s.close();		
	}
	public void update(Produto p) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(p);
		tx.commit();
		s.close();		
	}
	public List<Produto> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Produto> list = s.createCriteria(Produto.class).list();
		tx.commit();
		s.close();
		return list;
	}
	public int selectQtn() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		int  list = s.createCriteria(Produto.class).list().size();
		s.close();
		return list;
		
	}
	
}
