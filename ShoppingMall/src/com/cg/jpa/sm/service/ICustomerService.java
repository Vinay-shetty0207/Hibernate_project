package com.cg.jpa.sm.service;

import java.util.List;

import com.cg.jpa.sm.entities.Item;
import com.cg.jpa.sm.entities.Mall;
import com.cg.jpa.sm.entities.User;

public interface ICustomerService {
public Item orderItem(Item item);
public List<Item> searchItem(String itemName);
public Mall searchMall(long id);
public boolean cancelOrder(long orderId);
public User login(User user);
public boolean logout();
}
