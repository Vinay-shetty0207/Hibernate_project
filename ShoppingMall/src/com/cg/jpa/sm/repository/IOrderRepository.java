package com.cg.jpa.sm.repository;

import com.cg.jpa.sm.entities.Item;
import com.cg.jpa.sm.entities.OrderDetails;

public interface IOrderRepository {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public OrderDetails deleteOrder(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
