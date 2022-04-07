package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.Shop;
import com.cg.jpa.sm.entities.User;

public interface IAdminService {
	public boolean approveNewShop(Shop shop);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
