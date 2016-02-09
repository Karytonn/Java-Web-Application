package com.kappdev.dmania.dao;

import com.kappdev.dmania.bean.Funcionario;
import com.kappdev.dmania.util.HibernateUtil;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class FuncionarioDao{

	
	
	public void insert(Funcionario f) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(f);
		tx.commit();
		s.close();
	}
	public void delete(Funcionario f) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(f);
		tx.commit();
		s.close();
	}
	public void update(Funcionario f) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(f);
		tx.commit();
		s.close();	
	}
	public List<Funcionario> select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Funcionario> list = s.createCriteria(Funcionario.class).list();
		tx.commit();
		s.close();
		return list;
	}
	
	
}
