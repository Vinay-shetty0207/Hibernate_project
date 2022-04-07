package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.Employee;
import com.cg.jpa.sm.entities.Item;
import com.cg.jpa.sm.entities.Shop;

public interface IShopService {
public Shop addShop(Shop shop);
public Shop updateShop(Shop shop);
public Shop searchShopById(long id);
public boolean deleteShop(long id);
public boolean addEmployee(Employee employee);
public boolean updateEmployee(Employee employee);
public Item addItem(Item item);
}
