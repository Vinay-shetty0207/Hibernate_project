package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.Item;
import com.cg.jpa.sm.entities.OrderDetails;
import com.cg.jpa.sm.entities.ShopOwner;

public interface IShopOwnerRepository {

	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(long id);
	public ShopOwner deleteShopOwner(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}
