package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.Item;
import com.cg.jpa.sm.entities.OrderDetails;

public interface IOrderService  {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public boolean cancelMall(long id);
	public Item addItem(Item item);

}
