package com.cg.jpa.sm.repository;

import javax.persistence.EntityManager;

import com.cg.jpa.sm.entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements  IShopOwnerRepository 
{
	private EntityManager entityManager;
	public IShopOwnerRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopOwner searchShopOwner(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopOwner deleteShopOwner(long id) {
		// TODO Auto-generated method stub
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
