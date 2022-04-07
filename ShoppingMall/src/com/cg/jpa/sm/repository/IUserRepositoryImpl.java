package com.cg.jpa.sm.repository;

import javax.persistence.EntityManager;

import com.cg.jpa.sm.entities.Shop;
import com.cg.jpa.sm.entities.User;

public class IUserRepositoryImpl implements IUserRepository{
	
	private EntityManager entityManager;
	public IUserRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		User update = entityManager.merge(user);
		return update;
	}

	@Override
	public User deleteUser(long id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
