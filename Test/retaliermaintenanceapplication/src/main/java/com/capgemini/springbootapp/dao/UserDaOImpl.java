package com.capgemini.springbootapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.springbootapp.dto.UserInfo;
@Repository
public class UserDaOImpl implements UserDao {

	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean createProfile(UserInfo user) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(user);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInfo bean=manager.find(UserInfo.class,id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public UserInfo login(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInfo bean=manager.find(UserInfo.class,email);
		bean.setEmail(email);
		bean.setPassword(password);
		return bean;
	}

}
