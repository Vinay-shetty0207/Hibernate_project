package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.Item;

public interface IItemRepository {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(long id);
	public Item deleteItem(long id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
