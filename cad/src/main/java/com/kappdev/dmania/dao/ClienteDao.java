package com.kappdev.dmania.dao;

import com.kappdev.dmania.bean.Cliente;
import com.kappdev.dmania.util.HibernateUtil;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class ClienteDao{

	
	
	public void insert(Cliente c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(c);
		tx.commit();
		s.close();
	}
	public void delete(Cliente c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(c);
		tx.commit();
		s.close();
	}
	public void update(Cliente c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(c);
		tx.commit();
		s.close();	
	}
	public List<Cliente> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Cliente> list = s.createCriteria(Cliente.class).list();
		tx.commit();
		s.close();
		return list;
	}
	public int selectQtn() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		int  list = s.createCriteria(Cliente.class).list().size();
		s.close();
		return list;
	}
	
}
