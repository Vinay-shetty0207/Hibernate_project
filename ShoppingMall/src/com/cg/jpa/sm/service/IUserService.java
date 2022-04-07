package com.cg.jpa.sm.service;

import com.cg.jpa.sm.entities.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
